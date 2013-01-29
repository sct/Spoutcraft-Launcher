package org.spoutcraft.launcher.technic;

import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

import org.spoutcraft.launcher.technic.rest.CustomInfo;
import org.spoutcraft.launcher.technic.rest.Modpack;

public class CustomPack extends InstalledPack {
	private final CustomInfo info;

	public CustomPack(CustomInfo info) throws IOException {
		super(info.getLogo(), info.getLogo(), new ImageIcon(info.getBackground().getScaledInstance(880, 520, Image.SCALE_SMOOTH)));
		this.info = info;
		init();
	}

	@Override
	public String getName() {
		return info.getName();
	}

	@Override
	public String getDisplayName() {
		return info.getDisplayName();
	}

	@Override
	public String getRecommended() {
		return info.getVersion();
	}

	@Override
	public String getLatest() {
		return info.getVersion();
	}

	@Override
	public List<String> getBuilds() {
		List<String> builds = new ArrayList<String>(1);
		builds.add(getLatest());
		return builds;
	}

	@Override
	public Modpack getModpack() {
		// TODO Auto-generated method stub
		return null;
	}
}
