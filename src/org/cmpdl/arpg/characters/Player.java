package org.cmpdl.arpg.characters;

import org.cmpdl.arpg.attack.WeaponAttack;
import org.cmpdl.arpg.debuff.*;
import org.cmpdl.arpg.playerclass.PlayerClassBase;
import org.cmpdl.arpg.skill.Skill;

public class Player implements ApocalypseCharacter{
	private static Player player = null;
	private static int MAXHP = 1;
	private static int MAXMP = 1;
	private static int hp = 1;
	private static int mp = 1;
	private static int atk = 1;
	private static int matk = 1;
	private static int def = 1;
	private static int mdef = 1;
	private static int spd = 1;
	private static double pPen = 10;
	private static double mPen = 10;
	private static int eva = 1;
	private static int accu = 100;
	private static double hpReg = 0.1;
	private static double mpReg = 0.1;
	private static String name;
	private static PlayerClassBase playerClass;
	private static String weapon = "None";
	private static String armor = "None";
	private static String headGear = "None";
	private static String gloves = "None";
	private static String footWear = "None";
	
	private static boolean thornFlag = false;
	private static boolean stunFlag = false;
	private static int shield = 0;
	
	private static WeaponAttack weaponAttack;
	private static Skill[] skills = new Skill[6];
	private static int skillIndex = 0;
	private static int skillSize;
	
	private static Debuff[] debuffs = {new Curse(),new Frostbite(), new Silence(), new Vulnerable(), new Weakness()};
	private static Debuff[] dots = {new Burn(), new DPoison(), new Poison()};
	
	public void addDot(int index,int increment) {
		Player.dots[index].setStacks(Player.dots[index].getStacks() + increment);
	}
	
	public void setDot(int index, int value) {
		Player.dots[index].setStacks(value);
	}
	
	public Debuff getDot(int index) {
		return dots[index];
	}
	
	public static Player getInstance() {
		if (player == null) {
			player = new Player();
		}
		return player;
	}
	
	public int getSkillSize() {
		return skillSize;
	}
	
	public boolean isDead() {
		return (hp <= 0);
	}
	
	public Skill getSkill(int index) {
		return skills[index];
	}
	
	public void setSkill(Skill skill) {
		Player.skills[skillIndex] = skill;
		skillSize = skillSize + 1;
		skillIndex = skillIndex + 1;
	}
	
	public void addDebuff(int index,int increment) {
		Player.debuffs[index].setStacks(Player.debuffs[index].getStacks() + increment);
	}
	
	public void setDebuff(int index, int value) {
		Player.debuffs[index].setStacks(value);
	}
	
	public Debuff getDebuff(int index) {
		return debuffs[index];
	}
	
	public String getName(){
		return Player.name;
	}
	
	public void setName(String name){
		Player.name = name;
	}
	
	public int getHp(){
		return Player.hp;
	}
	
	public int getMaxHp() {
		return MAXHP;
	}
	
	public int getMaxMp() {
		return MAXMP;
	}
	
	public void setMaxHp(int maxHp) {
		Player.MAXHP = maxHp;
	}
	
	public void setMaxMp(int maxMp) {
		Player.MAXMP = maxMp;
	}
	
	public void setHp(int hp){
		Player.hp = hp;
		if (hp < 0) {
			Player.hp = 0;
		}
		else if(hp >= MAXHP) {
			Player.hp = MAXHP;
		}
	}
	
	public int getMp(){
		return Player.mp;
	}
	
	public void setMp(int mp){
		Player.mp = mp;
		if(mp < 0) {
			Player.mp = 0;
		}
		if(mp >= MAXMP) {
			Player.mp = MAXMP;
		}
	}
	
	public int getAtk(){
		return Player.atk;
	}
	
	public void setAtk(int atk){
		Player.atk = atk;
	}
	
	public int getMatk(){
		return Player.matk;
	}
	
	public void setMatk(int matk){
		Player.matk = matk;
	}
	
	public int getDef(){
		return Player.def;
	}
	
	public void setDef(int def){
		Player.def = def;
	}
	
	public int getMdef(){
		return Player.mdef;
	}
	
	public void setMdef(int mdef){
		Player.mdef = mdef;
	}
	
	public int getSpd(){
		return Player.spd;
	}
	
	public void setSpd(int spd){
		Player.spd = spd;
	}
	
	public double getpPen(){
		return Player.pPen;
	}
	
	public void setpPen(double pPen){
		Player.pPen = pPen;
	}
	
	public double getmPen(){
		return Player.mPen;
	}
	
	public void setMpen(double mPen){
		Player.mPen = mPen;
	}
	
	public int getEva(){
		return Player.eva;
	}
	
	public void setEva(int eva){
		Player.eva = eva;
	}
	
	public int getAccu(){
		return Player.accu;
	}
	
	public void setAccu(int accu){
		Player.accu = accu;
	}
	
	public double getHpReg(){
		return Player.hpReg;
	}
	
	public void setHpReg(double hpReg){
		Player.hpReg = hpReg;
	}
	
	public double getMpReg(){
		return Player.mpReg;
	}
	
	public void setMpReg(double mpReg){
		Player.mpReg = mpReg;
	}
	
	public boolean getThornFlag() {
		return thornFlag;
	}

	public void setThornFlag(boolean thornFlag) {
		Player.thornFlag = thornFlag;
		
	}

	public boolean getStunFlag(){
		return stunFlag;
	}

	public void setStunFlag(boolean bool) {
		Player.stunFlag = bool;
	}
	
	public int getShield() {
		return shield;
	}

	public void setShield(int shield) {
		Player.shield = shield;
	}


	public WeaponAttack getWeaponAttack() {
		return weaponAttack;
	}



	public void setWeaponAttack(WeaponAttack weaponAttack) {
		Player.weaponAttack = weaponAttack;
	}



	public PlayerClassBase getPlayerClass() {
		return playerClass;
	}



	public void setPlayerClass(PlayerClassBase playerClass) {
		Player.playerClass = playerClass;
	}



	public  String getWeapon() {
		return weapon;
	}



	public void setWeapon(String weapon) {
		Player.weapon = weapon;
	}



	public String getArmor() {
		return armor;
	}



	public void setArmor(String armor) {
		Player.armor = armor;
	}



	public String getHeadGear() {
		return headGear;
	}



	public void setHeadGear(String headGear) {
		Player.headGear = headGear;
	}



	public String getGloves() {
		return gloves;
	}



	public void setGloves(String gloves) {
		Player.gloves = gloves;
	}


	public String getFootWear() {
		return footWear;
	}



	public void setFootWear(String footWear) {
		Player.footWear = footWear;
	}
	

	@Override
	public Debuff[] getAllDebuff() {
		return debuffs;
	}

	@Override
	public Debuff[] getAllDoT() {
		return dots;
	}

	@Override
	public int getMaxSkillSize() {
		return skills.length;
	}
	@Override
	public int getDebuffSize() {
		return debuffs.length;
	}

	@Override
	public int getDotSize() {
		return dots.length;
	}

}
