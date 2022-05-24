package test.Quiz;
/*
 * 	정규식 이용해서 풀기.
 * 
 * 	정규식 - 특정한 규칙을 가진 문자열의 집합을 표현하는데 사용하는 형식언어
 * 
 * 	ex)이메일,핸드폰 번호 유효성 검사
 * 
 * 				<문법>
 * []- 문자의 집합,범위, []내에 ^가 선행하여 존재하면 not 
 * ex) [abc] - a,b,c중 하나 | [^abc] - a,b,c 의외 하나 |[a-zA-Z] - a~z, A~Z중 하나
 * ( | | ) - () 안에 |로 구분해서 교차매칭하여 찾는다.
 * ex)(Mon|Tues|Fri)day 
 * Monday Tuesday Friday
 * \d - 한 개의 숫자 [0-9]동일
 * \D - 숫자를 제외한 모든 문자
 * \s - 공백
 * \S - 공백이 아닌 나머지 문자
 * \w - 알파벳 또는 숫자,언더바(_)기호를 찾는다. [a-zA-Z_0-9]와 동일
 * \W - 알파벳 또는 숫자,언더바(_)기호를 제외한 문자를 찾는다.
 * <수량자> ?,*,+
 * ? - 없음 or 한 개 x = 0or1 a?b -> ab,ab,b
 * * - 없음 or 한 개이상 x>=0  a*b -> aab,ab,b
 * + - 한개이상 x>=1 a+b -> aab,ab 
 * {n} - 정확히 n개
 * {n,} - 최소한 n개
 * {n, m} - n개에서부터 m개까지
 * {} - 그룹핑 
 * ^ -문자열의 시작점
 * $ -문자열의 종료점
 * . - 임의의 한 문자
 * | - 패턴 안에서 or 연산
 * \ 특수기호를 찾을때
 */

class P72410 {
    public String solution(String new_id) {
        String str = new_id;
        str=str.toLowerCase();
        str=str.replaceAll("[^a-z0-9-_.]", "");
        str=str.replaceAll("\\.{2,}",".");
        str=str.replaceAll("\\^.|\\.$", "");
        
        if(str.isEmpty()){
           str="a";
        }
        
        if(str.length()>=16){
           str=str.substring(0,15).replaceAll("\\.$","");
        }
        
        if(str.length()<=2){           
			while(str.length()<=2) {
				str =str.concat(str.substring(str.length()-1));
			}			
		}
        return str;
    } 
}