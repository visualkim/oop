package io;

public class Tool {
	/**
	   * 수를 전달받아 자료의 단위를 적용합니다.
	   * @param size
	   * @return 1000 > 1000 Byte
	   */
	  public static synchronized String unit(long size){
	    String str = "";
	    
	    if (size < 1024){ // 1 KB 이하
	      str = size + " Byte";
	    }else if (size < 1024 * 1024){ // 1 MB 이하
	      str = (int)(Math.ceil(size/1024.0)) + " KB";
	    }else if (size < 1024 * 1024 * 1024){ // 1 GB 이하
	      str = (int)(Math.ceil(size/1024.0/1024.0)) + " MB";
	    }else if (size < 1024 * 1024 * 1024 * 1024){ // 1 TB 이하
	      str = (int)(Math.ceil(size/1024.0/1024.0/1024.0)) + " GB";
	    }else if (size < 1024 * 1024 * 1024 * 1024 * 1024){ // 1 PT 이하
	      str = (int)(Math.ceil(size/1024.0/1024.0/1024.0/1024.0)) + " TB";
	    }
	 
	    return str;
	  }

}
