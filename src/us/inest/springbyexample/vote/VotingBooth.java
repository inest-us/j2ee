package us.inest.springbyexample.vote;

public class VotingBooth {
	/*
	 * Now the LocalVoteRecorder class – the implementing class of the VoteRecorder interface -- is completely
	 * 	decoupled from the VotingBooth class. We have removed all hard-coded references to lower level classes
	 */
	VoteRecorder recorder = null;
	
	public void setVoteRecorder(VoteRecorder recorder) {
		this.recorder = recorder;
	}
	
	public void vote(Candidate candidate) {
		recorder.record(candidate);
	}
}
