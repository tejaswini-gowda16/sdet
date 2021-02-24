package Groovy_Practices

class Activity_1_b {

	static void main (def args) {
		File file = new File("src/Groovy_Practices/file")
		file.createNewFile();

		file.write("A quick brown Fox jumped over the lazy Cow\n")
		file.append("John Jimbo jingeled happily ever after\n")
		file.append("Th1\$ 1\$ v3ry c0nfus1ng")

		file.eachLine {
			if (it =~ /Cow$/)
			{
				println it
			}
			if (it =~/^J/)
			{
				println it
			}
			if (it =~/\d{2}/)
			{
				println it
			}
		}

		def m1 = file.text =~/\S+er/
		println m1.findAll()

		def m2 = file.text =~/\S*\d\W/
		println m2.findAll()
	}
}

