package hw_0619;

class Exercise2 {
	public static void main(String[] args) throws Exception{
		throw new UnsupportedFunctionException("�������� �ʴ� ����Դϴ�.",100);
	}
}

class UnsupportedFunctionException extends RuntimeException{
	final private int ERR_CODE;
	
	UnsupportedFunctionException(String msg, int errCode){
        super(msg);  // ����Ŭ���� RuntimeException��  �����ڸ� ȣ��
        ERR_CODE = errCode;
    }

    UnsupportedFunctionException(String msg){
        this(msg, 100);
    }

    public int getErrorCode(){ //�����ڵ带 ��ȯ�Ѵ�.
        return ERR_CODE;
    }

    public String getMessage(){ //�޼����� ������ ��ȯ�Ѵ�.
        return "[ " + getErrorCode() + " ]" + super.getMessage();
    }
}
