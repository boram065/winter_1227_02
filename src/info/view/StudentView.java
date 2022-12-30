package info.view;

import java.util.ArrayList;

import info.vo.StudentVO;

//화면을 보여주기(출력)위한 객체
public class StudentView {
	//view(ArrayList<StudentVO> svoList) : 화면을 출력을 위한 메소드
	public void view(ArrayList<StudentVO> svoList) {
		//개선된 for문
		for (StudentVO svo : svoList) {
			System.out.print("성명 : " + svo.getName() + "\t");
			System.out.print("학번 : " + svo.getStuId() + "\t");
			System.out.print("학년 : " + svo.getGrade() + "\t");
			System.out.print("전공 : " + svo.getMajor() + "\t");
			System.out.print("전화번호 : " + svo.getMobile() + "\n\n");
			System.out.println("------------------------------------------------------------------------------");
		}
	}
}
