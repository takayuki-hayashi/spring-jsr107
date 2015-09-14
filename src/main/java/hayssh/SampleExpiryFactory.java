package hayssh;

import java.util.concurrent.TimeUnit;

import javax.cache.configuration.Factory;
import javax.cache.expiry.CreatedExpiryPolicy;
import javax.cache.expiry.Duration;
import javax.cache.expiry.ExpiryPolicy;

public class SampleExpiryFactory implements Factory<ExpiryPolicy> {

	@Override
	public ExpiryPolicy create() {
		return new CreatedExpiryPolicy(new Duration(TimeUnit.SECONDS, 10));
	}
}
