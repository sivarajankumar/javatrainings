/**
 * Copyright 2011 Joao Miguel Pereira
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package eu.jpereira.trainings.designpatterns.structural.decorator.channel;

import eu.jpereira.trainings.designpatterns.structural.decorator.channel.ChannelPropertyKey;
import eu.jpereira.trainings.designpatterns.structural.decorator.channel.SocialChannelBuilder;
import eu.jpereira.trainings.designpatterns.structural.decorator.channel.SocialChannelProperties;
import eu.jpereira.trainings.designpatterns.structural.decorator.dummy.TestDummyChannel;

/**
 * @author jpereira
 * 
 */
public class DummySocialChannelBuilder extends SocialChannelBuilder {

	/**
	 * 
	 */
	public DummySocialChannelBuilder() {
		super.plugChannel(new SocialChannelProperties().setProperty(ChannelPropertyKey.NAME, "DUMMY"), TestDummyChannel.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see eu.jpereira.trainings.designpatterns.structural.decorator.channel.
	 * SocialChannelBuilder#addDefaultChannels()
	 */
	@Override
	protected void addDefaultChannels() {
		super.plugChannel(new SocialChannelProperties().setProperty(ChannelPropertyKey.NAME, TwitterChannel.NAME), TwitterChannel.class);
		super.plugChannel(new SocialChannelProperties().setProperty(ChannelPropertyKey.NAME, FacebookChannel.NAME), FacebookChannel.class);
		super.plugChannel(new SocialChannelProperties().setProperty(ChannelPropertyKey.NAME, LinkedinChannel.NAME), LinkedinChannel.class);

	}

}
