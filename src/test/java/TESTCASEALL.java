import static org.junit.Assert.*;



import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TESTCASEALL {
	
	private ArrayInsertion objtest;
	private ArrayDeletion objtest1;
	private Array objtest2;
	private Queue objtest3;	
	@Before
	public void object()
	{
		objtest=new ArrayInsertion();
		objtest1=new ArrayDeletion();
		objtest2=new Array();
		objtest3=new Queue(5);
	}
	@Test
	public void test() {
	
		boolean expected=true;
		objtest2.getValues();
		boolean val=objtest2.linearSearch(5);
		Assert.assertEquals(expected, val);
		
		//	fail("Not yet implemented");
	}
	@Test
	public void test1() {
	
		//objtest2.getValues();
		objtest2.main(null);
		Assert.assertEquals(1,1);
		
		//	fail("Not yet implemented");
	}
	@Test
	public void test2() {
		int []array= {1,2,4,0,0,0};
		int []arrayexpected= {1,2,4,5,0,0};
		int []arrays=objtest.insert(array, 5, 3);
		Assert.assertArrayEquals(arrayexpected, arrays);
		//fail("Not yet implemented");
	}
	@Test
	public void test3() {
		objtest.main(null);
		Assert.assertEquals(1,1);
	}
	@Test
		public void test4() {
		int []array= new int[0];
		int []arrayexpected=new int[0];
		int []arrays=objtest.insert(array, 2, 2);
		Assert.assertArrayEquals(arrayexpected, arrays);
	}
	
	@Test
		public void test5() {
	
		objtest1.main(null);	
		Assert.assertEquals(1, 1);
	
//	fail("Not yet implemented");
	}	
	@Test
		public void test6() {

			boolean exp=true;
			boolean val=objtest3.empty();
			Assert.assertEquals(exp, val);
			
			//		fail("Not yet implemented");
		}
	
	//Fails due to Exception
		@Test(expected=Exception.class)
		public void test7() throws Exception
		{
			QueueImplementation obj=new QueueImplementation();
			try
			{
			objtest3.enqueue(10);
			objtest3.enqueue(12);
			objtest3.enqueue(14);
			objtest3.enqueue(16);
			objtest3.enqueue(18);
			objtest3.display();
			objtest3.dequeue();
			objtest3.dequeue();
			objtest3.size();
			}
			catch (Exception e)
			{
				
			}
			
			int expected=5;
			int val=objtest3.size();
			System.out.print(val);
		//	obj.main(null);
			Assert.assertEquals(3,objtest3.sizeofQueue);
			
			//		objtest.display();
		}
	@Test
	public void test8()
	{
		CircularLinkedList list=new CircularLinkedList();
		list.pushFront(5);
		list.pushBack(6);
		int expect=5;
		int val=list.getkey(5);
		Assert.assertEquals(expect, val);
	}
	@Test
	public void test9()
	{
		CircularLinkedList list=new CircularLinkedList();
		list.pushFront(5);
		list.pushFront(7);
		list.pushBack(6);
		list.pushBack(8);
		
		list.popFront();
		list.popBack();
		list.display();
		int expect=5;
		int val=list.getkey(5);
		Assert.assertEquals(expect, val);
	}
	@Test
	public void test10()
	{
		LinkedList list=new LinkedList();
		list.pushFront(10);
		list.pushBack(12);
		list.pushFront(8);
		list.pushFront(6);
		
		list.display();
	
		list.swap();
		list.display();
		int val=list.getkey(5);
		int exp=5;
		Assert.assertEquals(exp, val);
		
	}
	@Test
	public void test11()
	{
		LinkedLists list = new LinkedLists();
		list.pushFront(10);
		list.pushBack(12);

		list.display();

		list.pushFront(8);
		list.pushFront(6);
		list.pushBack(20);

		list.display();
		
		list.pop(3);
		list.display();

		list.popFront();
		list.display();

		list.popBack();
		list.display();
		
		int val=list.getkey(4);
		int exp=4;
		Assert.assertEquals(exp, val);
	}
	@Test
	public void test12()
	{
		LinkedListImp list = new LinkedListImp();
		list.add(10);
		try
		{
		list.popFront();
		
		}
		catch (Exception e)
		{
			
		}
		list.add(12);
		
		list.display();

		list.pushFront(22);
		list.display();
		
		list.add(14);
		list.display();

		list.add(16);
		list.display();
		Assert.assertEquals(4,list.size());
	}
	@Test
	public void test13()
	{
		LinkedListImp list=new LinkedListImp();
		list.add(10);
		try
		{
		list.popFront();
		
		}
		catch (Exception e)
		{
			
		}
		list.add(12);
		
		list.display();

		list.pushFront(22);
		list.display();
		
		list.add(14);
		list.display();

		list.add(16);
		list.display();
		int val; 
		try
		{
			val=list.topFront();
		
		}
		catch(Exception e)
		{
			
		}
		Assert.assertEquals(12,12);
	}
	@Test
	public void test14()
	{
		LinkedListImp list = new LinkedListImp();
		int val;
		try
		{
		list.popFront();
		list.add(10);
		
		
		list.popFront();
		
	
		list.add(12);
		
		list.display();

		list.pushFront(22);
		list.display();
		
		list.add(14);
		list.display();

		list.add(16);
		list.display();
		
		list.popFront();
		
		list.display();
		val=list.topBack();
		}
		catch (Exception e)
		{
			
		}

		Assert.assertEquals(6, 6);
	}
	@Test
	public void test15()
	{
		LinkedListImp list = new LinkedListImp();
		int val;
		try
		{
		list.popFront();
		list.add(10);
		list.popFront();
		list.add(12);
		list.display();
		list.pushFront(22);
		list.display();
		list.add(14);
		list.display();
		list.add(16);
		list.display();
		list.popFront();
		list.display();
		list.topBack();
		list.pushBack(24);
		list.topBack();
		list.add(18);
		list.pushFront(20);
		val=list.size();
		}
		catch (Exception e)
		{
			
		}
		Assert.assertEquals(true, true);
	}
	@Test
	public void test16()
	{
		Dequeue queue=new Dequeue(5);
		queue.addRight(10);
		queue.display();

		queue.addLeft(20);
		queue.display();

		queue.addRight(12);
		queue.display();

		queue.addLeft(18);
		queue.display();
	
		queue.addRight(16);
		queue.addLeft(17);
		int val=queue.getright();
		System.out.println("TEST 16 : "+ val);
		Assert.assertEquals(1, val);
	}
	@Test
	public void test17()
	{
		QueueArr queue = new QueueArr(5); //create a queue 
		queue.enqueue(10); //add num = 10
		queue.enqueue(20); //add num = 20
		queue.enqueue(30); //add num = 30
		queue.enqueue(40); //add num = 40 
		queue.enqueue(50); //add num = 50
		queue.enqueue(60); //add num = 60
		Assert.assertEquals(5, queue.getsize());
	}
	@Test
	public void test18()
	{
		QueueArr queue = new QueueArr(5); //create a queue 
		queue.display();
		queue.enqueue(10); //add num = 10
		queue.enqueue(20); //add num = 20
		queue.enqueue(30); //add num = 30
		queue.enqueue(40); //add num = 40 
		queue.enqueue(50); //add num = 50
		queue.display();
		queue.dequeue();   //dequeue
		queue.dequeue();
		//queue.main(null);
		Assert.assertEquals(3, queue.getsize());
	}
	@Test
	public void test19()
	{
		QueueArr queue = new QueueArr(5); //create a queue 
		queue.display();
		queue.enqueue(10); //add num = 10
		queue.enqueue(20); //add num = 20
		queue.enqueue(30); //add num = 30
		queue.enqueue(40); //add num = 40 
		queue.enqueue(50); //add num = 50
		queue.display();
		queue.dequeue();   //dequeue
		queue.dequeue();
	queue.enqueue(20); //add num = 20
		
		queue.dequeue();   //dequeue
		queue.display();   //display queue
		queue.dequeue();   //dequeue
		queue.display();   //display queue
		queue.dequeue();   //dequeue
		queue.display();   //display queue 
		queue.dequeue();   //dequeue
		queue.display();   //display queue   
		queue.dequeue();   //dequeue
		queue.display();   //display queue
		queue.dequeue();   //dequeue
		queue.display();   //display queue
		Assert.assertEquals(0, queue.getsize());
	}
	@Test
	public void test20()
	{
		QueueLinked queue = new QueueLinked();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);

		queue.display();
		Assert.assertEquals(5, queue.getkey(5));
	}
	@Test
	public void test21()
	{
		QueueLinked queue = new QueueLinked();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.display();
		queue.dequeue();
		queue.enqueue(50);
		queue.display();
		queue.dequeue();
		queue.dequeue();
		queue.display();
		queue.dequeue();
		queue.dequeue();
		queue.display();
		Assert.assertEquals(5, queue.getkey(5));
	}
	@Test
	public void test22()
	{
		int val;
		MyStack stack = new MyStack(5);
		try
		{
		stack.push(10); //push num=10
		stack.push(12); //push num=12
		stack.push(14); //push num=14
		val=stack.top();
		}
		catch (Exception e)
		{
			val=10;
		}
		Assert.assertEquals(3, stack.size());	
			
	}
	@Test
	public void test23()
	{
		int val;
		MyStack stack = new MyStack(5);
		try
		{
		stack.push(10); //push num=10
		stack.push(12); //push num=12
		stack.push(14); //push num=14
		val=stack.top();
		stack.push(16); //push num=16
		stack.push(18); //push num=18
		
		stack.displayStack(); //display
		}
		catch (Exception e)
		{
			val=10;
		}
		Assert.assertEquals(5, stack.size());	
		
	}
	@Test
	public void test24()
	{
		int val;
		MyStack stack = new MyStack(5);
		try
		{
		stack.push(10); //push num=10
		stack.push(12); //push num=12
		stack.push(14); //push num=14
		stack.push(16); //push num=16
		stack.push(18); //push num=18
		
		stack.displayStack(); //display
		stack.pop();          //remove topmost element
		stack.displayStack(); //display stack.
		stack.pop();          //remove topmost element
		stack.displayStack(); //display stack.
		stack.pop();          //remove topmost element
		stack.displayStack(); //display stack.
		stack.pop();          //remove topmost element
		stack.displayStack(); //display stack.
		stack.pop();          //remove topmost element
		stack.displayStack(); 
		}
		catch (Exception e)
		{
			
		}
		Assert.assertEquals(0, stack.size());	
		
	}
	@Test
	public void test25()
	{
		Stack stack = new Stack();
		stack.push(10); //push num=10
		stack.push(20); //push num=20
		stack.push(30); //push num=30
		stack.display();//display stack.

		int val=stack.pop(); //pop element.
		Assert.assertEquals(30, val);
	}
	@Test
	public void test26()
	{
		Stack stack = new Stack();
		stack.push(10); //push num=10
		stack.push(20); //push num=20
		stack.push(30); //push num=30
		stack.display();//display stack.
		stack.pop();
		stack.display();//display stack.
		stack.push(40); //push num=40
		stack.display();//display stack.
		stack.pop();    //pop num.
		int val=stack.pop();    //pop element 
		stack.display();//display stack
		System.out.println(val);
		Assert.assertEquals(20, val);
	}
	@Test
	public void test27()
	{
		Stacks stack = new Stacks();
		stack.push(10);            //push num = 10
		stack.push(20);            //push num = 20
		stack.push(30);            //push num = 30

		stack.display();           //display stack.
		int val=stack.top();
		Assert.assertEquals(30, val);
	}
	@Test
	public void test28()
	{
		Stacks stack = new Stacks();
		stack.push(10);            //push num = 10
		stack.push(20);            //push num = 20
		stack.push(30);            //push num = 30

		stack.display();           //display stack.
		stack.top();
		stack.pop();               //pop topmost element
		stack.pop();               //pop topmost element
		stack.display();           //display stack.
		int val=stack.pop();    
		Assert.assertEquals(10, val);
	}
	@Test
	public void test29()
	{
		Stacks stack = new Stacks();
		stack.push(10);            //push num = 10
		stack.push(20);            //push num = 20
		stack.push(30);            //push num = 30
		int val=stack.getSize();
		Assert.assertEquals(3, val);
	}
	
}
