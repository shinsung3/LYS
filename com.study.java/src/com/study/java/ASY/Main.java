//Java Project -> JRE (Library) -> src(�ҽ��ڵ�sourcode)
//src -> *.java(������ �ڹ�����)
//java���� �ȿ� package, class, method

package com.study.java.ASY;

public class Main {
	public static void main(String[] args) {
		String new_id = "...!@BaT#*..y.abcdefghijklm123_-";
		String a = solution(new_id);
		System.out.println(a);
	}

	static String solution(String new_id) {
		String answer = "";

		// 1�ܰ� new_id�� ��� �빮�ڸ� �����Ǵ� �ҹ��ڷ� ġȯ�մϴ�.
		new_id = new_id.toLowerCase();
		System.out.println("1�ܰ�: "+new_id);

		// 2�ܰ� new_id���� ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.)�� ������ ��� ���ڸ� �����մϴ�.
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < new_id.length(); i++) {
			char temp = new_id.charAt(i);
			if ((temp >= 'a' && temp <= 'z') || temp == '_' || (temp-'0'>=0 && temp-'0'<=9) ||temp=='.' || temp=='-') {
				sb.append(temp);
			}
		}
		new_id = sb.toString();
		System.out.println("2�ܰ�: "+new_id);
		
		// 3�ܰ� new_id���� ��ħǥ(.)�� 2�� �̻� ���ӵ� �κ��� �ϳ��� ��ħǥ(.)�� ġȯ�մϴ�.
		sb = new StringBuilder();
		int cnt = 0;
		for(int i=0; i<new_id.length(); i++) {
			if(new_id.charAt(i)=='.') {
				cnt++;
			}else {
				if(cnt!=0) {
					sb.append(".").append(new_id.charAt(i));
					cnt=0;
					
				}else {
					sb.append(new_id.charAt(i));
				}
			}
		}
		new_id = sb.toString();
		System.out.println("3�ܰ�: "+new_id );
		
		return answer;
	}
}
