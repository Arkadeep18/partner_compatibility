import java.util.*;
public class Marriage_compatibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your zodiac sign");
		String My_zdc= sc.next().toLowerCase();
		System.out.println("Enter your partner's zodiac sign");
		String Partner_zdc = sc.next().toLowerCase();
		
		switch(My_zdc) {
		case "aries": {
			if(Partner_zdc.equals("Gemini")||Partner_zdc.equals("sagittarious")||Partner_zdc.equals("leo")) {
				System.out.println("The compatibility between you two is remarkable, making every interaction between you both feel like a seamless blend of harmony and understanding");
			}else {
				System.out.println("There might be some room for improvement in your relationship. Taking time to communicate openly, understand each other's perspectives, and find common ground could be beneficial.\r\n"
						+ "You both have the capability to overcome any challenges, just trust in yourselves and your bond.");
			}
			break;
		}
		case "taurus": {
			if(Partner_zdc.equals("cancer")||Partner_zdc.equals("pisces")||Partner_zdc.equals("capricorn")) {
				System.out.println("The compatibility between you two is remarkable, making every interaction between you both feel like a seamless blend of harmony and understanding");
			}else {
				System.out.println("There might be some room for improvement in your relationship. Taking time to communicate openly, understand each other's perspectives, and find common ground could be beneficial.\r\n"
						+ "You both have the capability to overcome any challenges, just trust in yourselves and your bond.");
			}
			break;
		}
		case "gemini": {
			if(Partner_zdc.equals("gemini")||Partner_zdc.equals("aquarius")||Partner_zdc.equals("libra")) {
				System.out.println("The compatibility between you two is remarkable, making every interaction between you both feel like a seamless blend of harmony and understanding");
			}else {
				System.out.println("There might be some room for improvement in your relationship. Taking time to communicate openly, understand each other's perspectives, and find common ground could be beneficial.\r\n"
						+ "You both have the capability to overcome any challenges, just trust in yourselves and your bond.");
			}
			break;
		}
		case "cancer": {
			if(Partner_zdc.equals("taurus")||Partner_zdc.equals("scorpio")||Partner_zdc.equals("virgo")) {
				System.out.println("The compatibility between you two is remarkable, making every interaction between you both feel like a seamless blend of harmony and understanding");
			}else {
				System.out.println("There might be some room for improvement in your relationship. Taking time to communicate openly, understand each other's perspectives, and find common ground could be beneficial.\r\n"
						+"You both have the capability to overcome any challenges, just trust in yourselves and your bond.");
			}
			break;
		}
		case "leo": {
			if(Partner_zdc.equals("sagittarious")||Partner_zdc.equals("aries")||Partner_zdc.equals("gemini")) {
				System.out.println("The compatibility between you two is remarkable, making every interaction between you both feel like a seamless blend of harmony and understanding");
			}else {
				System.out.println("There might be some room for improvement in your relationship. Taking time to communicate openly, understand each other's perspectives, and find common ground could be beneficial.\r\n"
						+"You both have the capability to overcome any challenges, just trust in yourselves and your bond.");
			}
			break;
		}
		case "virgo": {
			if(Partner_zdc.equals("capricorn")||Partner_zdc.equals("cancer")||Partner_zdc.equals("taurus")) {
				System.out.println("The compatibility between you two is remarkable, making every interaction between you both feel like a seamless blend of harmony and understanding");
			}else {
				System.out.println("There might be some room for improvement in your relationship. Taking time to communicate openly, understand each other's perspectives, and find common ground could be beneficial.\r\n"
						+"You both have the capability to overcome any challenges, just trust in yourselves and your bond.");
			}
			break;
		}
		case "libra": {
			if(Partner_zdc.equals("sagittarious")||Partner_zdc.equals("gemini")||Partner_zdc.equals("aquarius")) {
				System.out.println("The compatibility between you two is remarkable, making every interaction between you both feel like a seamless blend of harmony and understanding");
			}else {
				System.out.println("There might be some room for improvement in your relationship. Taking time to communicate openly, understand each other's perspectives, and find common ground could be beneficial.\r\n"
						+"You both have the capability to overcome any challenges, just trust in yourselves and your bond.");
			}
			break;
		}
		case "scorpio": {
			if(Partner_zdc.equals("scorpio")||Partner_zdc.equals("capricorn")||Partner_zdc.equals("pisces")) {
				System.out.println("The compatibility between you two is remarkable, making every interaction between you both feel like a seamless blend of harmony and understanding");
			}else {
				System.out.println("There might be some room for improvement in your relationship. Taking time to communicate openly, understand each other's perspectives, and find common ground could be beneficial.\r\n"
						+"You both have the capability to overcome any challenges, just trust in yourselves and your bond.");
			}
			break;
		}
		case "sagittarious":
			if(Partner_zdc.equals("aries")||Partner_zdc.equals("aquarius")||Partner_zdc.equals("sagittarious")) {
				System.out.println("The compatibility between you two is remarkable, making every interaction between you both feel like a seamless blend of harmony and understanding");
			}else {
				System.out.println("There might be some room for improvement in your relationship. Taking time to communicate openly, understand each other's perspectives, and find common ground could be beneficial.\r\n"
						+"You both have the capability to overcome any challenges, just trust in yourselves and your bond.");
			}
		case "capricorn": {
			if(Partner_zdc.equals("capricorn")||Partner_zdc.equals("pisces")||Partner_zdc.equals("taurus")||Partner_zdc.equals("virgo")) {
				System.out.println("The compatibility between you two is remarkable, making every interaction between you both feel like a seamless blend of harmony and understanding");
			}else {
				System.out.println("There might be some room for improvement in your relationship. Taking time to communicate openly, understand each other's perspectives, and find common ground could be beneficial.\r\n"
						+"You both have the capability to overcome any challenges, just trust in yourselves and your bond.");
			}
			break;
		}
		case "pisces": {
			if(Partner_zdc.equals("scorpio")||Partner_zdc.equals("cancer")||Partner_zdc.equals("capricorn")) {
				System.out.println("The compatibility between you two is remarkable, making every interaction between you both feel like a seamless blend of harmony and understanding");
			}else {
				System.out.println("There might be some room for improvement in your relationship. Taking time to communicate openly, understand each other's perspectives, and find common ground could be beneficial.\r\n"
						+"You both have the capability to overcome any challenges, just trust in yourselves and your bond.");
			}
			break;
		}
		case "aquarius": {
			if(Partner_zdc.equals("sagittarious")||Partner_zdc.equals("libra")||Partner_zdc.equals("gemini")) {
				System.out.println("The compatibility between you two is remarkable, making every interaction between you both feel like a seamless blend of harmony and understanding");
			}else {
				System.out.println("There might be some room for improvement in your relationship. Taking time to communicate openly, understand each other's perspectives, and find common ground could be beneficial.\r\\n"
						+"You both have the capability to overcome any challenges, just trust in yourselves and your bond."
						);
			}
			break;
			}default:System.out.println("Enter a valid zodiac sign. Your determination will guide you through any obstacles");
		}
	}
}
