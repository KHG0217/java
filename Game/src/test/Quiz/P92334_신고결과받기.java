package test.Quiz;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class P92334_신고결과받기 {
	public static void main(String[] args) {
        int[] answer = {};
        String[] id_list= {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k=2;
        answer = new int[id_list.length];

        
        /*
         * key 는 유저ID
         * value 는 신고한 유저ID의 set 을 가진 map
         * 동일한 유저ID에 대한 신고횟수는 1회로 처리하기 때문에 중복 허용을 하지 않는 set 을 value 로 사용
         * */
		Map<String, HashSet<String>> reportedMap = new HashMap<>(); // [신고된ID, [신고 찌른 ID]]
		Map<String, Integer> answerMap = new HashMap<>(); // [신고된Id, 메일 수]
		
		
		/* 1. Map 초기화 */
		for (int i = 0; i < id_list.length; i++) {
			HashSet<String> reportingId = new HashSet<>(); // 신고 찌른 id
			reportedMap.put(id_list[i], reportingId); 
			//key=[value] -> 찔린id=[찌른id]
			answerMap.put(id_list[i], 0);  // 메일 수는 모두 0 으로 초기화
		}
		System.out.println("[STEP 1] reportedMap : " + reportedMap);
		System.out.println("[STEP 1] answerMap : " + answerMap);
		
		
		/*
		 * 2. 신고 기록 세팅 report 는 "신고한ID 신고된ID" 로 구성됨
		 */
		for (String s : report) {
			String[] reportStr = s.split(" ");
			String reportingID = reportStr[0]; // 신고한ID
			String reportedID = reportStr[1]; // 신고된ID
			reportedMap.get(reportedID).add(reportingID);
			//신고된 id를 key값으로 가져와서 찌른id를 배열의 value값으로 넣기
			//reportedID(찔린key) <-찌른id를 벨류로 추가 
			
		}
		System.out.println("[STEP 2] reportedMap 에 신고 기록 세팅 : " + reportedMap);
		
		
		/*
		 * 3. 유저가 받은 이용 정지 결과 메일 세팅
		 */
		for (String reportedUser : reportedMap.keySet()) { // reportedUser 는 신고된ID유저		
			//reportedUser 변수에 ->reporteMap.ketset(i)값을 얻어옴=key값= 찔린id
			 
			HashSet<String> userForSend = reportedMap.get(reportedUser); 
			//userForSend 변수에 -> reportedMap에 key값의 value를 불러옴 = 찌른 id
			//찔린 id를 찌른 id가 몇개인지 userForSend에 담기
			
			if (userForSend.size() >= k) { 
				// 신고된 횟수가 K번 이상일 경우 
				for (String userId : userForSend) {
					//userId에 userForSend 찌른 k명 1개씩 증가시켜주기
					answerMap.put(userId, answerMap.get(userId) +1); 
					// answerMap 에 신고된Id 별 메일 수 넣기
					// userID = id_list[i]에 answerMap 에 userId키값에 1+증가
				}
			}
		}
		System.out.println("[STEP 3] answerMap 에 메일 수 세팅 : " + answerMap);
		
		
		/*
		 * 4. 유저ID 별 받은 메일 수를 answer 에 세팅
		 */
		for (int i = 0; i < id_list.length; i++) {
			answer[i] = answerMap.get(id_list[i]);
			System.out.println("[STEP 4] answer : " +answer[i]);
		}
	
	}
}
}
