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

class RadiantRangeCreep implements RangeCreep {}

class DireRangeCreep implements RangeCreep {}

interface MeleeCreep {}

class RadiantMeleeCreep implements MeleeCreep {}

class DireMeleeCreep implements MeleeCreep {}

interface CreepFactory {
	public MeleeCreep spawnMelee();
	public RangeCreep spawnRange();
}

class RadiantCreepFactory implements CreepFactory {
	public MeleeCreep spawnMelee() {
		System.out.println("radiant melee creep has benn spawned");
		return new RadiantMeleeCreep();
	}
	public RangeCreep spawnRange() {
		System.out.println("radiant range creep has benn spawned");
		return new RadiantRangeCreep();
	}
}

class DireCreepFactory implements CreepFactory {
	public MeleeCreep spawnMelee() {
		System.out.println("dire melee creep has benn spawned");
		return new DireMeleeCreep();
	}
	public RangeCreep spawnRange() {
		System.out.println("dire range creep has benn spawned");
		return new DireRangeCreep();
	}
}