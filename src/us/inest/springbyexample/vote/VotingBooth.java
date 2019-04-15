package us.inest.springbyexample.vote;

public class VotingBooth {
	/*
	 * Now the LocalVoteRecorder class – the implementing class of the VoteRecorder interface -- is completely
	 * 	decoupled from the VotingBooth class. We have removed all hard-coded references to lower level classes
	 */
	private VoteRecorder voteRecorder = null;
	
	public VoteRecorder getVoteRecorder() {
		return voteRecorder;
	}
	
	public void setVoteRecorder(VoteRecorder voteRecorder) {
		this.voteRecorder = voteRecorder;
	}
	
	public void vote(Candidate candidate) {
		voteRecorder.record(candidate);
	}
}
