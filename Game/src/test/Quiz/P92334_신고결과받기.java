package test.Quiz;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class P92334_�Ű����ޱ� {
	public static void main(String[] args) {
        int[] answer = {};
        String[] id_list= {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k=2;
        answer = new int[id_list.length];

        
        /*
         * key �� ����ID
         * value �� �Ű��� ����ID�� set �� ���� map
         * ������ ����ID�� ���� �Ű�Ƚ���� 1ȸ�� ó���ϱ� ������ �ߺ� ����� ���� �ʴ� set �� value �� ���
         * */
		Map<String, HashSet<String>> reportedMap = new HashMap<>(); // [�Ű��ID, [�Ű� � ID]]
		Map<String, Integer> answerMap = new HashMap<>(); // [�Ű��Id, ���� ��]
		
		
		/* 1. Map �ʱ�ȭ */
		for (int i = 0; i < id_list.length; i++) {
			HashSet<String> reportingId = new HashSet<>(); // �Ű� � id
			reportedMap.put(id_list[i], reportingId); 
			//key=[value] -> ��id=[�id]
			answerMap.put(id_list[i], 0);  // ���� ���� ��� 0 ���� �ʱ�ȭ
		}
		System.out.println("[STEP 1] reportedMap : " + reportedMap);
		System.out.println("[STEP 1] answerMap : " + answerMap);
		
		
		/*
		 * 2. �Ű� ��� ���� report �� "�Ű���ID �Ű��ID" �� ������
		 */
		for (String s : report) {
			String[] reportStr = s.split(" ");
			String reportingID = reportStr[0]; // �Ű���ID
			String reportedID = reportStr[1]; // �Ű��ID
			reportedMap.get(reportedID).add(reportingID);
			//�Ű�� id�� key������ �����ͼ� �id�� �迭�� value������ �ֱ�
			//reportedID(��key) <-�id�� ������ �߰� 
			
		}
		System.out.println("[STEP 2] reportedMap �� �Ű� ��� ���� : " + reportedMap);
		
		
		/*
		 * 3. ������ ���� �̿� ���� ��� ���� ����
		 */
		for (String reportedUser : reportedMap.keySet()) { // reportedUser �� �Ű��ID����		
			//reportedUser ������ ->reporteMap.ketset(i)���� ����=key��= ��id
			 
			HashSet<String> userForSend = reportedMap.get(reportedUser); 
			//userForSend ������ -> reportedMap�� key���� value�� �ҷ��� = � id
			//�� id�� � id�� ����� userForSend�� ���
			
			if (userForSend.size() >= k) { 
				// �Ű�� Ƚ���� K�� �̻��� ��� 
				for (String userId : userForSend) {
					//userId�� userForSend � k�� 1���� ���������ֱ�
					answerMap.put(userId, answerMap.get(userId) +1); 
					// answerMap �� �Ű��Id �� ���� �� �ֱ�
					// userID = id_list[i]�� answerMap �� userIdŰ���� 1+����
				}
			}
		}
		System.out.println("[STEP 3] answerMap �� ���� �� ���� : " + answerMap);
		
		
		/*
		 * 4. ����ID �� ���� ���� ���� answer �� ����
		 */
		for (int i = 0; i < id_list.length; i++) {
			answer[i] = answerMap.get(id_list[i]);
			System.out.println("[STEP 4] answer : " +answer[i]);
		}
	
	}
}
}
