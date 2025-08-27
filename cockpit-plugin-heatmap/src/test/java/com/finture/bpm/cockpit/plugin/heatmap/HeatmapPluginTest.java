package com.finture.bpm.cockpit.plugin.heatmap;

import com.finture.bpm.cockpit.Cockpit;
import com.finture.bpm.cockpit.plugin.spi.CockpitPlugin;
import com.finture.bpm.cockpit.plugin.test.AbstractCockpitPluginTest;
import org.junit.Assert;
import org.junit.Test;

public class HeatmapPluginTest extends AbstractCockpitPluginTest {

	@Test
	public void testPluginDiscovery() {
		CockpitPlugin samplePlugin = Cockpit.getRuntimeDelegate()
				.getPluginRegistry().getPlugin(HeatmapPlugin.ID);
		Assert.assertNotNull(samplePlugin);		
	}

}
