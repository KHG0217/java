package test.main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
	public static void main(String[] args) {

		String[] id_list = { "muzi", "frodo", "apeach", "neo" };
		String[] report = { "muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi" };
		int k = 2;
		int[] answer = new int[id_list.length];

		Map<String, HashSet<String>> idMap = new HashMap<>();
		Map<String, Integer> answerMap = new HashMap<>();

		for (int i = 0; i < id_list.length; i++) {
			HashSet<String> reportedId = new HashSet<>();
			idMap.put(id_list[i], reportedId);
			answerMap.put(id_list[i], 0);			
		}

		for (String s : report) {
			String[] strDivide = s.split(" ");
			String reportingId = strDivide[0];
			String reportedId = strDivide[1];
			idMap.get(reportedId).add(reportingId);
		}

		for (String reportedId : idMap.keySet()) {
			HashSet<String> reportingId = idMap.get(reportedId);
			if (reportingId.size() >= k) {
				for (String userId : reportingId) {
					answerMap.put(userId, answerMap.get(userId) + 1);
				}
			}
		}

		for (int i = 0; i < id_list.length; i++) {
			answer[i] = answerMap.get(id_list[i]);
			System.out.println(answer[i]);
		}
		return answer;
	}

}