package UnionFind;

class Tree<T>{
	T data;
	int parent;
	
	public Tree(){}
	public Tree(T data, int parent){
		this.data = data;
		this.parent = parent;
	}
	
}

public class UnionFind {
	//	�ڵ���
	int cnt = 0;
	int[] node;//ÿ���ڵ�
	
	public UnionFind(int count){
		cnt = count;
		node = new int[count]; //ÿ���ڵ�
	}
	
	//��ʼ��n���ڵ� 
	void Init(int n){ 
		for(int i = 0; i < n; i++){ 
			node[i] = i; 
		} 
	} 
	
	//���ҵ�ǰԪ���������ĸ��ڵ�(����Ԫ��)
	int find(int x){ 
		if(x == node[x]) 
			return x; 
		return find(node[x]); 
	} 
	
	//�ϲ�Ԫ��x�� y�����ļ��� 
	void Unite(int x, int y){ 
		//���ҵ�x��y�ĸ��ڵ� 
		x = find(x); y = find(y); 
		if(x == y) 
			return; 
		//��x�ĸ��ڵ���y�ĸ��ڵ����� 
		node[x] = y; 
	} 
	
	//�ж�x��y������ͬһ������ 
	boolean same(int x, int y){ 
		return find(x) == find(y); 
	}
}
