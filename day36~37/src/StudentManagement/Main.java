package StudentManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		JdbcTamplate jdbcTamplate = new JdbcTamplate();
		StudentDao stuDao = new StudentDao(jdbcTamplate);
		SubjectDao subDao = new SubjectDao(jdbcTamplate);
		AchievDao achDao = new AchievDao(jdbcTamplate);
		boolean boo = true;

		while (boo) {
			System.out.println("       *학생 성적관리 프로그램*");
			System.out.println("1.등록  2.수정  3.검색  4.삭제  5.종료");
			System.out.print("입력 : ");
			int cho = sc.nextInt();
			if (cho == 5) {
				System.out.println("프로그램 종료");
				System.out.println();
				boo = false;
			} else if (cho == 1) {
				System.out.println("1.학생 등록(학번 자동생성)  2.과목 등록  3.성적 등록");
				System.out.print("입력 : ");
				int cho2 = sc.nextInt();
				sc.nextLine();
				if (cho2 == 1) {
					System.out.print("등록할 학생 이름 입력 : ");
					String name = sc.nextLine();
					StudentVo stuvo = new StudentVo();
					stuvo.setName(name);
					stuvo.setId(1);
					stuDao.insert(stuvo);
				} else if (cho2 == 2) {
					System.out.print("등록할 과목 이름 입력 : ");
					String subName = sc.nextLine();
					SubjectVo subvo = new SubjectVo();
					subvo.setSubjectNum(1);
					subvo.setSubjectName(subName);
					subDao.insert(subvo);
				} else if (cho2 == 3) {
					System.out.print("학생 이름 입력 : ");
					String name = sc.nextLine();
					System.out.print("과목 이름 입력 : ");
					String subject = sc.nextLine();
					System.out.print("점수 입력 : ");
					int score = sc.nextInt();
					sc.nextLine();
					System.out.print("학점 입력 : ");
					String grade = sc.nextLine();
					AchievVo achvo = new AchievVo();
					achvo.setGrade(grade);
					achvo.setScore(score);
					achvo.setScoreNum(1);
					achDao.insert(name, subject, score, grade);
				}
				System.out.println();
			} else if (cho == 2) {
				System.out.println("1.학생 정보 수정  2.과목 정보 수정  3.성적 정보 수정");
				System.out.print("입력 : ");
				int cho2 = sc.nextInt();
				sc.nextLine();
				if (cho2 == 1) {
					System.out.print("학번 입력 : ");
					int id = sc.nextInt();
					sc.nextLine();
					System.out.print("변경할 이름 입력 : ");
					String name = sc.nextLine();
					stuDao.update(name, id);
				} else if (cho2 == 2) {
					System.out.print("과목 이름 입력 : ");
					String subName = sc.nextLine();
					System.out.print("변경할 과목 코드 입력 : ");
					int subNum = sc.nextInt();
					subDao.update(subName, subNum);
				} else if (cho2 == 3) {
					System.out.print("학생 이름 입력 : ");
					String name = sc.nextLine();
					System.out.print("변경할 점수의 과목 입력 : ");
					String subject = sc.nextLine();
					System.out.print("변경할 점수 입력 : ");
					int score = sc.nextInt();
					sc.nextLine();
					System.out.print("변경할 학점 입력 : ");
					String grade = sc.nextLine();
					achDao.update(name, subject, score, grade);
				}
				System.out.println();
			} else if (cho == 3) {
				System.out.println("1.학생 검색  2.과목 검색  3.성적 검색");
				System.out.print("입력 : ");
				int cho2 = sc.nextInt();
				if (cho2 == 1) {
					System.out.println("1.이름으로(특정학생 정보) 검색  2.학번으로(특정학생 정보) 검색  3.전체 학생(성적제외) 검색");
					System.out.print("입력 : ");
					int cho3 = sc.nextInt();

					if (cho3 == 1) {
						System.out.print("검색할 이름 입력 : ");
						sc.nextLine();
						String name = sc.nextLine();
						ArrayList<AchievVo> al = achDao.selectName(name);
						for (AchievVo achvo : al) {
							System.out.println(achvo);
						}
					} else if (cho3 == 2) {
						System.out.print("검색할 학번 입력 : ");
						int id = sc.nextInt();
						ArrayList<AchievVo> al = achDao.selectId(id);
						for (AchievVo achvo : al) {
							System.out.println(achvo);
						}
					} else if (cho3 == 3) {
						ArrayList<StudentVo> al = stuDao.select();
						for (StudentVo stuvo : al) {
							System.out.println(stuvo);
						}
					}
				} else if (cho2 == 2) {
					ArrayList<SubjectVo> al = subDao.select();
					for (SubjectVo subvo : al) {
						System.out.println(subvo);
					}
				} else if (cho2 == 3) {
					ArrayList<AchievVo> al = achDao.select();
					for (AchievVo achvo : al) {
						System.out.println(achvo);
					}
					System.out.println();
				}
			} else if (cho == 4) {
				System.out.println("1.학생(모든정보) 삭제  2.과목 삭제");
				System.out.print("입력 : ");
				int cho2 = sc.nextInt();
				if (cho2 == 1) {
					System.out.print("삭제할 이름 입력 : ");
					sc.nextLine();
					String name = sc.nextLine();
					stuDao.delete(name);
				} else if (cho2 == 2) {
					System.out.print("삭제할 과목번호 입력 : ");
					int subNum = sc.nextInt();
					subDao.delete(subNum);
				}
				System.out.println();
			} else {
				System.out.println("잘못 입력");
				System.out.println();
			}
		}

	}

}
