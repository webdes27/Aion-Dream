package com.aionemu.gameserver.model.custom.templates;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="TemperingRateLevelTemplates")
public class TemperingRateLevelTemplates {
	@XmlAttribute(name="min", required=true)
	private int min;
	@XmlAttribute(name="max", required=true)
	private int max;
	@XmlAttribute(name="chance", required=true)
	private int chance;
  
	public int getMin() {
		return min;
	}
  
	public int getMax() {
		return max;
	}
  
	public int getChance() {
		return chance;
	}
}