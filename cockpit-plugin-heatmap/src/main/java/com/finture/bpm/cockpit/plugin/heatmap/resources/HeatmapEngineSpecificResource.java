package com.finture.bpm.cockpit.plugin.heatmap.resources;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.finture.bpm.cockpit.db.QueryParameters;
import com.finture.bpm.cockpit.plugin.resource.AbstractCockpitPluginResource;

import com.finture.bpm.cockpit.plugin.heatmap.dto.StatsContainerDto;

public class HeatmapEngineSpecificResource extends AbstractCockpitPluginResource {

	@Inject
	public HeatmapEngineSpecificResource(String engineName) {
		super(engineName);
	}
	
	@GET
	@Path("process-definition/{id}/activitystats")
	public List<StatsContainerDto> getActivityStats(
			@PathParam("id") String processDefinitionId) {
		QueryParameters parameter = new QueryParameters();
		parameter.setParameter(processDefinitionId);
		return getQueryService().executeQuery(
				"cockpit.heatmap.selectStatsForActitvity", parameter);

	}

}
