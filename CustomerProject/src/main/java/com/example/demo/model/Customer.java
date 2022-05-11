package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="test")
public class Customer {
    @Id
    @GeneratedValue
    public int id;
    public String Name;
    public String warmth;
    public String reasoning;
    public String EmotionalStability;
    public String dominance;
    public String liveLiness;
    public String ruleConciousness;
    public String socialBoldness;
    public String sensitivity;
    public String vigilance;
    public String abstractedness;
    public String privateness;
    public String apprehensivness;
    public String openessToChange;
    public String selfReliance;
    public String perfectionsism;
    public String tension;

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", warmth='" + warmth + '\'' +
                ", reasoning='" + reasoning + '\'' +
                ", EmotionalStability='" + EmotionalStability + '\'' +
                ", dominance='" + dominance + '\'' +
                ", liveLiness='" + liveLiness + '\'' +
                ", ruleConciousness='" + ruleConciousness + '\'' +
                ", socialBoldness='" + socialBoldness + '\'' +
                ", sensitivity='" + sensitivity + '\'' +
                ", vigilance='" + vigilance + '\'' +
                ", abstractedness='" + abstractedness + '\'' +
                ", privateness='" + privateness + '\'' +
                ", apprehensivness='" + apprehensivness + '\'' +
                ", openessToChange='" + openessToChange + '\'' +
                ", selfReliance='" + selfReliance + '\'' +
                ", perfectionsism='" + perfectionsism + '\'' +
                ", tension='" + tension + '\'' +
                '}';
    }

    public int id() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String Name() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String warmth() {
        return warmth;
    }

    public void setWarmth(String warmth) {
        this.warmth = warmth;
    }

    public String reasoning() {
        return reasoning;
    }

    public void setReasoning(String reasoning) {
        this.reasoning = reasoning;
    }

    public String EmotionalStability() {
        return EmotionalStability;
    }

    public void setEmotionalStability(String emotionalStability) {
        EmotionalStability = emotionalStability;
    }

    public String dominance() {
        return dominance;
    }

    public void setDominance(String dominance) {
        this.dominance = dominance;
    }

    public String liveLiness() {
        return liveLiness;
    }

    public void setLiveLiness(String liveLiness) {
        this.liveLiness = liveLiness;
    }

    public String ruleConciousness() {
        return ruleConciousness;
    }

    public void setRuleConciousness(String ruleConciousness) {
        this.ruleConciousness = ruleConciousness;
    }

    public String socialBoldness() {
        return socialBoldness;
    }

    public void setSocialBoldness(String socialBoldness) {
        this.socialBoldness = socialBoldness;
    }

    public String sensitivity() {
        return sensitivity;
    }

    public void setSensitivity(String sensitivity) {
        this.sensitivity = sensitivity;
    }

    public String vigilance() {
        return vigilance;
    }

    public void setVigilance(String vigilance) {
        this.vigilance = vigilance;
    }

    public String abstractedness() {
        return abstractedness;
    }

    public void setAbstractedness(String abstractedness) {
        this.abstractedness = abstractedness;
    }

    public String privateness() {
        return privateness;
    }

    public void setPrivateness(String privateness) {
        this.privateness = privateness;
    }

    public String apprehensivness() {
        return apprehensivness;
    }

    public void setApprehensivness(String apprehensivness) {
        this.apprehensivness = apprehensivness;
    }

    public String openessToChange() {
        return openessToChange;
    }

    public void setOpenessToChange(String openessToChange) {
        this.openessToChange = openessToChange;
    }

    public String selfReliance() {
        return selfReliance;
    }

    public void setSelfReliance(String selfReliance) {
        this.selfReliance = selfReliance;
    }

    public String perfectionsism() {
        return perfectionsism;
    }

    public void setPerfectionsism(String perfectionsism) {
        this.perfectionsism = perfectionsism;
    }

    public String tension() {
        return tension;
    }

    public void setTension(String tension) {
        this.tension = tension;
    }
}
