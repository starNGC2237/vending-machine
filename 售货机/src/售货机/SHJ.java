package 售货机;
public class SHJ {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		float A1=3.0F,B1=2.5F,C1=3.5F,D1=5.0F;
		System.out.println("——————————————————————————————\n A1 3.0元  B1 2.5元\n C1 3.5元  D1 5.0元 \n"); 
		System.out.println("请输入金额.\n");
		java.util.Scanner s=new java.util.Scanner(System.in);
		float money=s.nextFloat();//投钱
		System.out.println("选择要买的东西的编号.\n");//选饮料 
		System.out.println("按X结束");//结束 
		while(money>=0){
			java.util.Scanner C=new java.util.Scanner(System.in);
			String name=C.next();
			 	if("A1".equals(name)){
			 		if(chooseA(money,A1)==-2) {
			 			break;
			 		}
			 		else{
			 			money=chooseA(money,A1);
			 			}
				}else if("B1".equals(name)) {
					if(chooseB(money,B1)==-2) {
			 			break;
			 		}
			 		else{
			 			money=chooseB(money,B1);
			 			}
			 	}else if("C1".equals(name)) {
			 		if(chooseC(money,C1)==-2) {
			 			break;
			 		}
			 		else{
			 			money=chooseC(money,C1);
			 			}
			 	}else if("D1".equals(name)) {
			 		if(chooseD(money,D1)==-2) {
			 			break;
			 		}
			 		else{
			 			money=chooseD(money,D1);
			 			}
			 	}else if("X".equals(name)) {
			 		break;
			 	}else{	
			 		System.out.println("请输入正确的编号！\n");}	//输不对怀疑你的智商  
			 		System.out.println("你现在有的钱：");
			 		System.out.println(money);
			 		System.out.println("选择要买的东西的编号.\n");//选饮料
			 		System.out.println("按X结束");//结束
			 	}
		}
	
	//选择A1
			public static float chooseA(float moneyr,float A1){
				if((moneyr-A1)>=0) {//判断你的支付能力（贫穷与否查看器）
					moneyr=moneyr-A1; 
					System.out.println("支付成功！\n  获得一瓶A1饮料！\n");	}
				else{
					System.out.println("支付A未成功，请加钱！");//让你打钱
					System.out.println("您投入的硬币数量为:\n");//输入钱数
					System.out.println("(输入数字0回到主菜单)\n"); 
					java.util.Scanner c=new java.util.Scanner(System.in);
					float plusmoney=c.nextFloat();
					moneyr=moneyr+plusmoney;
					if(plusmoney==0) {
						if(menu()==-1) {
							return moneyr;
						}else if(menu()==-2){
							return -2;
						}
						
					}
					else{
					if((moneyr-A1)>=0) {//判断你的支付能力（贫穷与否查看器）
						moneyr=moneyr-A1; 
						System.out.println("支付成功！\n  获得一瓶A1饮料！\n");	
						return moneyr;}
						}
					} 
				return moneyr;
			}
	
	//选择B1
	public static float chooseB(float moneyr,float B1){
		if((moneyr-B1)>=0) {//判断你的支付能力（贫穷与否查看器）
			moneyr=moneyr-B1; 
			System.out.println("支付成功！\n  获得一瓶B1饮料！\n");	}
		else{
			System.out.println("支付B未成功，请加钱！");//让你打钱
			System.out.println("您投入的硬币数量为:\n");//输入钱数
			System.out.println("(输入数字0回到主菜单)\n"); 
			java.util.Scanner c=new java.util.Scanner(System.in);
			float plusmoney=c.nextFloat();
			if(plusmoney==0){
				
			}moneyr=moneyr+plusmoney;
			if(plusmoney==0) {
				if(menu()==-1) {
					return moneyr;
				}else if(menu()==-2){
					return -2;
				}
				
			}
			else{
			if((moneyr-B1)>=0) {//判断你的支付能力（贫穷与否查看器）
				moneyr=moneyr-B1; 
				System.out.println("支付成功！\n  获得一瓶B1饮料！\n");	
				return moneyr;}
			}
		}
		return moneyr;
	}
	
	
	//选择C1
		public static float chooseC(float moneyr,float C1){
			if((moneyr-C1)>=0) {//判断你的支付能力（贫穷与否查看器）
				moneyr=moneyr-C1; 
				System.out.println("支付成功！\n  获得一瓶C1饮料！\n");	}
			else{
				System.out.println("支付C未成功，请加钱！");//让你打钱
				System.out.println("您投入的硬币数量为:\n");//输入钱数
				System.out.println("(输入数字0回到主菜单)\n"); 
				java.util.Scanner c=new java.util.Scanner(System.in);
				float plusmoney=c.nextFloat();
				moneyr=moneyr+plusmoney;
				if(plusmoney==0) {
					if(menu()==-1) {
						return moneyr;
					}else if(menu()==-2){
						return -2;
					}
					
				}
				else{
					if((moneyr-C1)>=0) {//判断你的支付能力（贫穷与否查看器）
						moneyr=moneyr-C1; 
						System.out.println("支付成功！\n  获得一瓶C1饮料！\n");	
						return moneyr;}
					} 
				}
			return moneyr;
		}
		
		//选择D1
				public static float chooseD(float moneyr,float D1){
					if((moneyr-D1)>=0) {//判断你的支付能力（贫穷与否查看器）
						moneyr=moneyr-D1; 
						System.out.println("支付成功！\n  获得一瓶D1饮料！\n");
						
					}else{
						System.out.println("支付D未成功，请加钱！");//让你打钱
						System.out.println("您投入的硬币数量为:\n");//输入钱数
						System.out.println("(输入数字0回到主菜单)\n"); 
						java.util.Scanner c=new java.util.Scanner(System.in);
						float plusmoney=c.nextFloat();
						moneyr=moneyr+plusmoney;
						if(plusmoney==0) {
							if(menu()==-1) {
								return moneyr;
							}else if(menu()==-2){
								return -2;
							}
							
						}
						else{if((moneyr-D1)>=0) {//判断你的支付能力（贫穷与否查看器）
							moneyr=moneyr-D1; 
							System.out.println("支付成功！\n  获得一瓶D1饮料！\n");	
							return moneyr;}
							}
						} 
					return moneyr;
				}
				
				public static float menu() {
					float x=0;
					System.out.println("——————————————————————————————\n A1 3.0元  B1 2.5元\n C1 3.5元  D1 5.0元 \n");
					System.out.println("是否继续购买？");
					java.util.Scanner str=new java.util.Scanner(System.in);
					String isno=str.next();
					if("Y".equals(isno)) {
						x=-1;
					}else if("N".equals(isno)){
						x=-2;
					}
					return x;
				}
}
