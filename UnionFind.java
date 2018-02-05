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
	//	节点数
	int cnt = 0;
	int[] node;//每个节点
	
	public UnionFind(int count){
		cnt = count;
		node = new int[count]; //每个节点
	}
	
	//初始化n个节点 
	void Init(int n){ 
		for(int i = 0; i < n; i++){ 
			node[i] = i; 
		} 
	} 
	
	//查找当前元素所在树的根节点(代表元素)
	int find(int x){ 
		if(x == node[x]) 
			return x; 
		return find(node[x]); 
	} 
	
	//合并元素x， y所处的集合 
	void Unite(int x, int y){ 
		//查找到x，y的根节点 
		x = find(x); y = find(y); 
		if(x == y) 
			return; 
		//将x的根节点与y的根节点相连 
		node[x] = y; 
	} 
	
	//判断x，y是属于同一个集合 
	boolean same(int x, int y){ 
		return find(x) == find(y); 
	}
}
