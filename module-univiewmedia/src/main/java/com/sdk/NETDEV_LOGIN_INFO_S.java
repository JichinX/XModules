package com.sdk;
         /*锟借备锟斤拷息*/

public class NETDEV_LOGIN_INFO_S {
	public int LoginType;                          /* 0:鏈�鍦扮櫥褰�; 1:鍔ㄦ€佸瘑鐮佺櫥褰�; 2:鏀�鎸佺��涓夋柟璁惧��; 3:浜戣�惧�囩櫥褰昞*/

    /* 锟斤拷态锟斤拷锟斤拷锟铰硷拷侄锟� */
    public int  lpUserID;                           /* 锟狡讹拷锟剿伙拷锟斤拷录ID User login ID */
    public String szDeviceName;              /* Device name */
    public String szDevicePassword;          /* Device login password (optional) */
    public int dwT2UTimeout;                 /* P2P timeout (default: 15s) */
    public int dwConnectMode;                /* Connect Mode, 0:鐩磋繛銆佹墦娲炪€佽浆鍙戯紱1锛氱洿杩炪€佹墦娲�+杞�鍙戯紱2锛氭墦娲烇紱3锛氳浆鍙� */

    /* 锟斤拷锟截碉拷录锟街讹拷 */
    public String  mDevIP;               /* 锟借备IP Device IP */
    public String  mUserName;            /* 锟矫伙拷锟斤拷 User Name */
    public String  mPassword;            /* 锟斤拷锟斤拷 Password */
    public int dwDevPort;                           /* 锟借备锟斤拷锟斤拷锟斤拷锟剿匡拷 Device Server Port */
}