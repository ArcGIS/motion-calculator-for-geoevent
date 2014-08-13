package com.esri.geoevent.processor.motioncalculator;

import com.esri.ges.spatial.Geometry;

public class MotionCalculatorEvent
{
  private Geometry geometry;
	private String category;
	private Long currentCounter;
  private Long cumulativeCounter;
	private boolean stopMonitoring;

	public MotionCalculatorEvent(Geometry geometry, String category, Long currentCounter, Long cumulativeCounter, boolean stopMonitoring)
	{
	  this.geometry = geometry;
		this.category = category;
		this.setCurrentCounter(currentCounter);
		this.setCumulativeCounter(cumulativeCounter);
		this.stopMonitoring = stopMonitoring;
	}

	public Geometry getGeometry()
	{
	  return geometry;
	}
	
	public String getCategory()
	{
		return category;
	}

	public boolean isStopMonitoring()
	{
		return stopMonitoring;
	}

	@Override
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("EventCountByCategoryEvent(");
		sb.append(category);
		sb.append(", ");
		sb.append(getCurrentCounter());
    sb.append(", ");
    sb.append(getCumulativeCounter());
		sb.append(")");
		return sb.toString();
	}

  public Long getCurrentCounter()
  {
    return currentCounter;
  }

  public void setCurrentCounter(Long currentCounter)
  {
    this.currentCounter = currentCounter;
  }

  public Long getCumulativeCounter()
  {
    return cumulativeCounter;
  }

  public void setCumulativeCounter(Long cumulativeCounter)
  {
    this.cumulativeCounter = cumulativeCounter;
  }
}