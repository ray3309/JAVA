package ex2_Study;

import java.util.ArrayList;
import java.util.List;


// 모든 메소드를 클래스 배열로 리턴하게 수정저치
public class GetClassScan {

	/**
	 * 모든 리소스 디렉토리를 검색하여 클래스 파일(.class)을 찾습니다. 
	 * @param directory 리소스 디렉토리
	 * @param packageName 패키지 경로
	 * @return 클래스 배열
	 */
	public static List<Class<?>> scan(String basePackageName){
		List<Class<?>> classes = new ArrayList<Class<?>>();
		return classes;
	}
	
	//public 
//	File[] files = directory.listFiles();
//	for (File file : files) {
//		if (file.isDirectory()) {
//			//System.out.println("[Directory] " + file.getAbsolutePath());
//			classes.addAll(findClasses(file, packageName + "." + file.getName()));
//		} else if (file.getName().endsWith(".class")) {
//			//System.out.println("[File] " + file.getAbsolutePath());
//			String className = packageName + '.' + file.getName().substring(0, file.getName().length() - 6);
//			ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
//			try {
//				classes.add(Class.forName(className, false, classLoader));
//			} catch (ClassNotFoundException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//
//	return classes;
}
