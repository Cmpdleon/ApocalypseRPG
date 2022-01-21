package org.cmpdl.arpg.characters;

import org.cmpdl.arpg.attack.EnemyMgcAtk;
import org.cmpdl.arpg.attack.WeaponAttack;
import org.cmpdl.arpg.debuff.Burn;
import org.cmpdl.arpg.debuff.Curse;
import org.cmpdl.arpg.debuff.DPoison;
import org.cmpdl.arpg.debuff.Debuff;
import org.cmpdl.arpg.debuff.Frostbite;
import org.cmpdl.arpg.debuff.Poison;
import org.cmpdl.arpg.debuff.Silence;
import org.cmpdl.arpg.debuff.Vulnerable;
import org.cmpdl.arpg.debuff.Weakness;
import org.cmpdl.arpg.skill.Immunity;
import org.cmpdl.arpg.skill.Skill;

public class Pestilence implements ApocalypseCharacter{
	private int MAXHP = 150;
	private int MAXMP = 100;
	private int hp = 150;
	private int mp = 100;
	private int atk = 40;
	private int matk = 40;
	private int def = 100;
	private int mdef = 100;
	private int spd = 18;
	private double pPen = 0;
	private double mPen = 0.01;
	private int eva = 0;
	private int accu = 100;
	private double hpReg = 0.01;
	private double mpReg = 0.02;
	private String name = "PESTILENCE";
	private boolean stunFlag = false;
	private int shield;
	private boolean thornFlag = false;
	
	private WeaponAttack enemyMgcAtk = new EnemyMgcAtk();
	private Debuff[] debuffs = {new Curse(),new Frostbite(), new Silence(), new Vulnerable(), new Weakness()};
	private Debuff[] dots = {new Burn(), new DPoison(), new Poison()};
	private Skill[] skills = {new Immunity()};
	
	public Pestilence(){
		System.out.println("\nPESTILENCE appeared.");
		System.out.printf("\tSkill: %s: %s\n", skills[0].getName(), skills[0].getDesc());
	}
	@Override
	public Skill getSkill(int index) {
		return skills[index];
	}
	@Override
	public void addDot(int index,int increment) {
		this.dots[index].setStacks(this.dots[index].getStacks() + increment);
	}
	@Override
	public void setDot(int index, int value) {
		this.dots[index].setStacks(value);
	}
	@Override
	public Debuff getDot(int index) {
		return dots[index];
	}
	@Override
	public void addDebuff(int index,int increment) {
		this.debuffs[index].setStacks(this.debuffs[index].getStacks() + increment);
	}
	@Override
	public void setDebuff(int index, int value) {
		this.debuffs[index].setStacks(value);
	}
	@Override
	public Debuff getDebuff(int index) {
		return debuffs[index];
	}
	@Override
	public String getName(){
		return this.name;
	}
	@Override
	public void setName(String name){
		this.name = name;
	}
	@Override
	public int getHp(){
		return this.hp;
	}
	@Override
	public void setHp(int hp){
		this.hp = hp;
		if (hp < 0) {
			this.hp = 0;
		}
		if(hp >= MAXHP) {
			this.hp = MAXHP;
		}
	}
	@Override
	public int getMaxHp() {
		return MAXHP;
	}
	@Override
	public int getMaxMp() {
		return MAXMP;
	}
	@Override
	public void setMaxHp(int max) {
		this.MAXHP = max;
	}
	@Override
	public void setMaxMp(int max) {
		this.MAXMP = max;
	}
	@Override
	public int getMp(){
		return this.mp;
	}
	@Override
	public void setMp(int mp){
		this.mp = mp;
		if(mp < 0) {
			this.mp = 0;
		}
		if(mp >= MAXMP) {
			this.mp = MAXMP;
		}
	}
	@Override
	public int getAtk(){
		return this.atk;
	}
	@Override
	public void setAtk(int atk){
		this.atk = atk;
	}
	@Override
	public int getMatk(){
		return this.matk;
	}
	@Override
	public void setMatk(int matk){
		this.matk = matk;
	}
	@Override
	public int getDef(){
		return this.def;
	}
	@Override
	public void setDef(int def){
		this.def = def;
	}
	@Override
	public int getMdef(){
		return this.mdef;
	}
	@Override
	public void setMdef(int mdef){
		this.mdef = mdef;
	}
	@Override
	public int getSpd(){
		return this.spd;
	}
	@Override
	public void setSpd(int spd){
		this.spd = spd;
	}
	@Override
	public double getpPen(){
		return this.pPen;
	}
	@Override
	public boolean isDead() {
		return (hp <= 0);
	}
	@Override
	public void setpPen(double pPen){
		this.pPen = pPen;
	}
	@Override
	public double getmPen(){
		return this.mPen;
	}
	@Override
	public void setMpen(double mPen){
		this.mPen = mPen;
	}
	@Override
	public int getEva(){
		return this.eva;
	}
	@Override
	public void setEva(int eva){
		this.eva = eva;
	}
	@Override
	public int getAccu(){
		return this.accu;
	}
	@Override
	public void setAccu(int accu){
		this.accu = accu;
	}
	@Override
	public double getHpReg(){
		return this.hpReg;
	}
	@Override
	public void setHpReg(double hpReg){
		this.hpReg = hpReg;
	}
	@Override
	public double getMpReg(){
		return this.mpReg;
	}
	@Override
	public void setMpReg(double mpReg){
		this.mpReg = mpReg;
	}
	@Override
	public boolean getStunFlag(){
		return stunFlag;
	}
	@Override
	public void setStunFlag(boolean bool) {
		this.stunFlag = bool;
	}
	@Override
	public int getShield() {
		return shield;
	}
	@Override
	public void setShield(int shield) {
		this.shield = shield;
	}

	@Override
	public void setSkill(Skill skill) {}

	@Override
	public WeaponAttack getWeaponAttack() {
		return enemyMgcAtk;
	}

	@Override
	public boolean getThornFlag() {
		return thornFlag;
	}

	@Override
	public void setThornFlag(boolean thornFlag) {
		this.thornFlag = thornFlag;	
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
	public int getSkillSize() {
		return 1;
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
