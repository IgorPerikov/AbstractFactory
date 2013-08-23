package ru.tsu.csd;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		List<CreepFactory> l = new ArrayList<CreepFactory>();
		l.add(new RadiantCreepFactory());
		l.add(new DireCreepFactory());
		for (CreepFactory cf : l) {
			cf.spawnMelee();
			cf.spawnRange();
		}
	}
}

interface RangeCreep {}

class RadiantRangeCreep implements RangeCreep {
	public RadiantRangeCreep() {
		System.out.println("radiant range creep has benn spawned");
	}
}

class DireRangeCreep implements RangeCreep {
	public DireRangeCreep() {
		System.out.println("dire range creep has benn spawned");
	}
}

interface MeleeCreep {}

class RadiantMeleeCreep implements MeleeCreep {
	public RadiantMeleeCreep() {
		System.out.println("radiant melee creep has benn spawned");
	}
}

class DireMeleeCreep implements MeleeCreep {
	public DireMeleeCreep() {
		System.out.println("dire melee creep has benn spawned");
	}
}

interface CreepFactory {
	public MeleeCreep spawnMelee();
	public RangeCreep spawnRange();
}

class RadiantCreepFactory implements CreepFactory {
	public MeleeCreep spawnMelee() {
		return new RadiantMeleeCreep();
	}
	public RangeCreep spawnRange() {
		return new RadiantRangeCreep();
	}
}

class DireCreepFactory implements CreepFactory {
	public MeleeCreep spawnMelee() {
		return new DireMeleeCreep();
	}
	public RangeCreep spawnRange() {
		return new DireRangeCreep();
	}
}