import groovyx.gpars.*
class Test{
	public static void main(String[] args){
		GParsPool.withPool{
			args.eachParallel{
				println it
			}
		}
	}
}
