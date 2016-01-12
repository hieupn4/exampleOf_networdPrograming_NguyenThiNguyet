/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package check_last_modify_File;

import java.net.URL;
import java.net.URLConnection;

/**
 * lấy thông tin của thời gian lần cuối cùng của một file nào đó trên server được sửa đổi
 * @author PhamNgocHieu
 */
public class check_last_modify {
    public static void main(String[] argv) 
   throws Exception {
      URL u = new URL("http://thethao.vnexpress.net/photo/giai-ngoai-hang-anh/vong-21-ngoai-hang-anh-bao-tap-cho-arsenal-tai-anfield-3341430.html");
      URLConnection uc = u.openConnection();
      uc.setUseCaches(false);// không sử dụng cache
      long timestamp = uc.getLastModified();
      System.out.println("The last modification time of java.bmp is :"+timestamp);
   }
    
}
