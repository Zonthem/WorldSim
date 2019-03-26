package com.zonthem.WorldSim.Bean;

import com.zonthem.WorldSim.Bean.LivingEntities.LivingEntity;
import com.zonthem.WorldSim.Bean.Resources.Resources;

import java.util.List;

public interface Case {

    List<LivingEntity> getAllLivingEntities();

    List<Resources> getAllResources();

}
