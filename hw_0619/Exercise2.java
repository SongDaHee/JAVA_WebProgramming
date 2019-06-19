package hw_0619;

class Exercise2 {
	public static void main(String[] args) throws Exception{
		throw new UnsupportedFunctionException("지원하지 않는 기능입니다.",100);
	}
}

class UnsupportedFunctionException extends RuntimeException{
	final private int ERR_CODE;
	
	UnsupportedFunctionException(String msg, int errCode){
        super(msg);  // 조상클래스 RuntimeException의  생성자를 호출
        ERR_CODE = errCode;
    }

    UnsupportedFunctionException(String msg){
        this(msg, 100);
    }

    public int getErrorCode(){ //에러코드를 반환한다.
        return ERR_CODE;
    }

    public String getMessage(){ //메세지의 내용을 반환한다.
        return "[ " + getErrorCode() + " ]" + super.getMessage();
    }
}
