pipelineJob("job1-test") {
	description()
	keepDependencies(false)
	definition {
		cpsScm {
			scm {
				git {
					remote {
						github("Copypass/jenkins", "https")
					}
					branch("*/master")
				}
			}
			scriptPath("jenkinfiles/job1-test.jenkins")
		}
	}
	disabled(false)
}
