package com.finture.bpm.cockpit.plugin.heatmap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.finture.bpm.cockpit.plugin.spi.impl.AbstractCockpitPlugin;

import com.finture.bpm.cockpit.plugin.heatmap.resources.HeatmapRootResource;

public class HeatmapPlugin extends AbstractCockpitPlugin {

  public static final String ID = "heatmap";

  private static final String[] MAPPING_FILES = {
          "com.finture.bpm.cockpit.plugin.heatmap.queries/heatmap.xml"
	  };
  
  public String getId() {
    return ID;
  }

  @Override
  public Set<Class<?>> getResourceClasses() {
    Set<Class<?>> classes = new HashSet<Class<?>>();

    classes.add(HeatmapRootResource.class);

    return classes;
  }
  
  @Override
	public List<String> getMappingFiles() {
	  return Arrays.asList(MAPPING_FILES);
	}

}
