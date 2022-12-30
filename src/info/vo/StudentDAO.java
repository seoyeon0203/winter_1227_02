package info.vo;

import java.util.ArrayList;

// Data Access Object 
public class StudentDAO {
	// ArrayList : 학생 정보 객체(StudentVO)들을 저장하기 위해 
	ArrayList<StudentVO> svoList = new ArrayList<StudentVO>();
	// insert : ArrayList에 학생정보객체인 (StudentVO)를 추가하는 매소드
	public void insert(StudentVO svo) {
		svoList.add(svo);
	}
	// select : 전체 학생 정보 객체들을 반환하는 메소드
	public ArrayList<StudentVO> select(){
		return svoList;
	}
}
