package �ۻ���;
public class SHJ {
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		float A1=3.0F,B1=2.5F,C1=3.5F,D1=5.0F;
		System.out.println("������������������������������������������������������������\n A1 3.0Ԫ  B1 2.5Ԫ\n C1 3.5Ԫ  D1 5.0Ԫ \n"); 
		System.out.println("��������.\n");
		java.util.Scanner s=new java.util.Scanner(System.in);
		float money=s.nextFloat();//ͶǮ
		System.out.println("ѡ��Ҫ��Ķ����ı��.\n");//ѡ���� 
		System.out.println("��X����");//���� 
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
			 		System.out.println("��������ȷ�ı�ţ�\n");}	//�䲻�Ի����������  
			 		System.out.println("�������е�Ǯ��");
			 		System.out.println(money);
			 		System.out.println("ѡ��Ҫ��Ķ����ı��.\n");//ѡ����
			 		System.out.println("��X����");//����
			 	}
		}
	
	//ѡ��A1
			public static float chooseA(float moneyr,float A1){
				if((moneyr-A1)>=0) {//�ж����֧��������ƶ�����鿴����
					moneyr=moneyr-A1; 
					System.out.println("֧���ɹ���\n  ���һƿA1���ϣ�\n");	}
				else{
					System.out.println("֧��Aδ�ɹ������Ǯ��");//�����Ǯ
					System.out.println("��Ͷ���Ӳ������Ϊ:\n");//����Ǯ��
					System.out.println("(��������0�ص����˵�)\n"); 
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
					if((moneyr-A1)>=0) {//�ж����֧��������ƶ�����鿴����
						moneyr=moneyr-A1; 
						System.out.println("֧���ɹ���\n  ���һƿA1���ϣ�\n");	
						return moneyr;}
						}
					} 
				return moneyr;
			}
	
	//ѡ��B1
	public static float chooseB(float moneyr,float B1){
		if((moneyr-B1)>=0) {//�ж����֧��������ƶ�����鿴����
			moneyr=moneyr-B1; 
			System.out.println("֧���ɹ���\n  ���һƿB1���ϣ�\n");	}
		else{
			System.out.println("֧��Bδ�ɹ������Ǯ��");//�����Ǯ
			System.out.println("��Ͷ���Ӳ������Ϊ:\n");//����Ǯ��
			System.out.println("(��������0�ص����˵�)\n"); 
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
			if((moneyr-B1)>=0) {//�ж����֧��������ƶ�����鿴����
				moneyr=moneyr-B1; 
				System.out.println("֧���ɹ���\n  ���һƿB1���ϣ�\n");	
				return moneyr;}
			}
		}
		return moneyr;
	}
	
	
	//ѡ��C1
		public static float chooseC(float moneyr,float C1){
			if((moneyr-C1)>=0) {//�ж����֧��������ƶ�����鿴����
				moneyr=moneyr-C1; 
				System.out.println("֧���ɹ���\n  ���һƿC1���ϣ�\n");	}
			else{
				System.out.println("֧��Cδ�ɹ������Ǯ��");//�����Ǯ
				System.out.println("��Ͷ���Ӳ������Ϊ:\n");//����Ǯ��
				System.out.println("(��������0�ص����˵�)\n"); 
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
					if((moneyr-C1)>=0) {//�ж����֧��������ƶ�����鿴����
						moneyr=moneyr-C1; 
						System.out.println("֧���ɹ���\n  ���һƿC1���ϣ�\n");	
						return moneyr;}
					} 
				}
			return moneyr;
		}
		
		//ѡ��D1
				public static float chooseD(float moneyr,float D1){
					if((moneyr-D1)>=0) {//�ж����֧��������ƶ�����鿴����
						moneyr=moneyr-D1; 
						System.out.println("֧���ɹ���\n  ���һƿD1���ϣ�\n");
						
					}else{
						System.out.println("֧��Dδ�ɹ������Ǯ��");//�����Ǯ
						System.out.println("��Ͷ���Ӳ������Ϊ:\n");//����Ǯ��
						System.out.println("(��������0�ص����˵�)\n"); 
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
						else{if((moneyr-D1)>=0) {//�ж����֧��������ƶ�����鿴����
							moneyr=moneyr-D1; 
							System.out.println("֧���ɹ���\n  ���һƿD1���ϣ�\n");	
							return moneyr;}
							}
						} 
					return moneyr;
				}
				
				public static float menu() {
					float x=0;
					System.out.println("������������������������������������������������������������\n A1 3.0Ԫ  B1 2.5Ԫ\n C1 3.5Ԫ  D1 5.0Ԫ \n");
					System.out.println("�Ƿ��������");
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
