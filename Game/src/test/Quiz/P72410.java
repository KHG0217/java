package test.Quiz;
/*
 * 	���Խ� �̿��ؼ� Ǯ��.
 * 
 * 	���Խ� - Ư���� ��Ģ�� ���� ���ڿ��� ������ ǥ���ϴµ� ����ϴ� ���ľ��
 * 
 * 	ex)�̸���,�ڵ��� ��ȣ ��ȿ�� �˻�
 * 
 * 				<����>
 * []- ������ ����,����, []���� ^�� �����Ͽ� �����ϸ� not 
 * ex) [abc] - a,b,c�� �ϳ� | [^abc] - a,b,c �ǿ� �ϳ� |[a-zA-Z] - a~z, A~Z�� �ϳ�
 * ( | | ) - () �ȿ� |�� �����ؼ� ������Ī�Ͽ� ã�´�.
 * ex)(Mon|Tues|Fri)day 
 * Monday Tuesday Friday
 * \d - �� ���� ���� [0-9]����
 * \D - ���ڸ� ������ ��� ����
 * \s - ����
 * \S - ������ �ƴ� ������ ����
 * \w - ���ĺ� �Ǵ� ����,�����(_)��ȣ�� ã�´�. [a-zA-Z_0-9]�� ����
 * \W - ���ĺ� �Ǵ� ����,�����(_)��ȣ�� ������ ���ڸ� ã�´�.
 * <������> ?,*,+
 * ? - ���� or �� �� x = 0or1 a?b -> ab,ab,b
 * * - ���� or �� ���̻� x>=0  a*b -> aab,ab,b
 * + - �Ѱ��̻� x>=1 a+b -> aab,ab 
 * {n} - ��Ȯ�� n��
 * {n,} - �ּ��� n��
 * {n, m} - n���������� m������
 * {} - �׷��� 
 * ^ -���ڿ��� ������
 * $ -���ڿ��� ������
 * . - ������ �� ����
 * | - ���� �ȿ��� or ����
 * \ Ư����ȣ�� ã����
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