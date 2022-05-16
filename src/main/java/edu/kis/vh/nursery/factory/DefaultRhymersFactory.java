package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
<<<<<<< HEAD
import edu.kis.vh.nursery.Fiforhymer;
=======
import edu.kis.vh.nursery.FifoRhymer;
>>>>>>> class-method-naming
import edu.kis.vh.nursery.HanoiRhymer;

public class DefaultRhymersFactory implements Rhymersfactory {

	@Override
	public DefaultCountingOutRhymer GetStandardRhymer() {
		return new DefaultCountingOutRhymer();
	}

	@Override
	public DefaultCountingOutRhymer GetFalseRhymer() {
		return new DefaultCountingOutRhymer();
	}

	@Override
	public DefaultCountingOutRhymer GetFIFORhymer() {
<<<<<<< HEAD
		return new Fiforhymer();
=======
		return new FifoRhymer();
>>>>>>> class-method-naming
	}

	@Override
	public DefaultCountingOutRhymer GetHanoiRhymer() {
		return new HanoiRhymer();
	}

}
