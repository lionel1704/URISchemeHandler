package urlProtocolHandler;

public class RealURLProtocolHandlerFactory {

	public static RealURLProtocolHandler produce(final String osName) {
		final String osLowerCase = osName.toLowerCase();
		if(osLowerCase.contains("linux")){
			return new LinuxURLProtocolHandler();
		}
		if(osLowerCase.contains("windows")){
			return new WindowsURLProtocolHandler();
		}
		if(osLowerCase.contains("mac")){
			return new MacURLProtocolHandler();
		}
		throw new RuntimeException("OS not supported");
	}

}