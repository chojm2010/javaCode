package makeUpClass;

public class ArrayTest {

	public static void main(String[] args) {
		// 배열 : 데이터를 저장하는 공간?
		// 배열은 타입별로 데이터를 저장한다.
		// 인덱스, 요소
		// 인덱스 : 요소의 번지수(위치)
		// 요소 : 배열안에 들어와 있는 데이터 들
		
		// 배열은 선언시 타입 옆 [] 형태를 부여
		//         
		int[] a = {23,12,76,34,15};
		
		// 배열의 접근 -> 인덱싱
		//System.out.println(a[4]);
		
		// 배열을 만드는 방법 
		// 1. 공간과 값을 할당하는법
		// -> 위의 코드 참조
		// 2. 인스턴스(객체)를 생성하여 할당하는법
		int[] intArr = new int[] {1,3,5,7};
		for(int i=0; i<intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		// 3. 공간만 할당하고 이후 값 넣기
	    int[] intArr2 = new int[6];
	    
	    intArr2[0] = 1;
	    intArr2[3] = 5;
	    
	    // 배열공간의 크기 확인
	    //System.out.println(intArr2.length);
	    
	    //이차원배열
	    
	    //이차원 배열의 선언
	    char[][] test = new char[5][5];
	    test[0][0] = '1';
	    
	    char[][] test2 = {
	    		{'1', '2', '3'},
	    		{'4', '6', '8'},
	    		{'5', '7', '9'},
	    };
	    System.out.println(test2[1][2]);
	    
	}

}
