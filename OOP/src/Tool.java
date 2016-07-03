
class Tool {
	/**
	   * ���� ���޹޾� �ڷ��� ������ �����մϴ�.
	   * @param size
	   * @return 1000 > 1000 Byte
	   */
	  public static synchronized String unit(long size){
	    String str = "";
	    
	    if (size < 1024){ // 1 KB ����
	      str = size + " Byte";
	    }else if (size < 1024 * 1024){ // 1 MB ����
	      str = (int)(Math.ceil(size/1024.0)) + " KB";
	    }else if (size < 1024 * 1024 * 1024){ // 1 GB ����
	      str = (int)(Math.ceil(size/1024.0/1024.0)) + " MB";
	    }else if (size < 1024 * 1024 * 1024 * 1024){ // 1 TB ����
	      str = (int)(Math.ceil(size/1024.0/1024.0/1024.0)) + " GB";
	    }else if (size < 1024 * 1024 * 1024 * 1024 * 1024){ // 1 PT ����
	      str = (int)(Math.ceil(size/1024.0/1024.0/1024.0/1024.0)) + " TB";
	    }
	 
	    return str;
	  }

}
