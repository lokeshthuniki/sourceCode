-->Create Organisation 
--> create repository
-->we'll get SSH link
-->we should SSH setup key
		/C/Users/Hi/.ssh/id_rsa
-->eval $(ssh-agent -s)
-->ssh add ~/.ssh/id_rsa		



-->go to base path::
		git bash here::
		->git init
		Now this will become the working area (.git folder will be created)==(UNTRACKED FILES)
		-> git add .
		Now this will be in stage area (TRACKED FILES/STAGED FILES)
		
		(Upto above it is in git)
		(Till upto now we are in local system)
		
		we're moving to GitHub
		
		-->git commit -m ""
		Now this will be moved to Web(GitHub)
		
		--> git remote add origin https://github.com/Jasthill-company-Limited/sourceCode.git(SSH KEY LINK)
		-->to verify whether it is connected to git hub or not ==>git remote -v
		
		-->git push -u origin master (The code can be seen succesfully in GITHUB)
		-->fork the code(we should fork and select our username and check it out there we will find the forked copy)
		
		-->(Cloning should be done in seperate folder so that code will be available here):: gitbash in the new folder(Ex:sourceCode) and do below process
													git clone git@github.com:lokeshthuniki/sourceCode.git(COPY SSH KEY AND PASTE HERE)
		(Origin is the place of our local forked code where as upstream is the place where we 
											should place the updated code where it can be used by everyone)
		-->go to the organization copy SSH code and paste here::
			->cd sourceCode(where the cloning has been done) 
			->git remote add upstream git@github.com:Jasthill-company-Limited/sourceCode.git
			
			to verify it is done or not go to sourcecode/.git/config file:::
						[remote "origin"]
						url = git@github.com:lokeshthuniki/sourceCode.git
						fetch = +refs/heads/*:refs/remotes/origin/*
						[branch "master"]
						remote = origin
						merge = refs/heads/master
						[remote "upstream"] ====>Here remote should be upstream (Organisational level)
						url = git@github.com:Jasthill-company-Limited/sourceCode.git
						fetch = +refs/heads/*:refs/remotes/upstream/*
		
		
		
-->git branch "myBranchName"  :::To create new Branch
-->git checkout myBranchName ::This will switch to MyBranchName
-->git branch -d myBranchName:::will delete the branch
-->git checkout (BRANCHNAME):::to switch from from one branch to another
-->git checkout -b newBranch ::This will create branch and switched directly
--> git push origin newBranch ::: The branch will be pushed to GITHUB
-->git push origin --delete newBranch::(If we push code then we should use this)
-->git merge <branchname(Ex:master)> modified data in one file will be modified in another also
-->git pull upstream master::




		


		
		
