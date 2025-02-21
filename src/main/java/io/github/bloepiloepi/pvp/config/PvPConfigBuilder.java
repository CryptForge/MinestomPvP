package io.github.bloepiloepi.pvp.config;

public class PvPConfigBuilder {
    private AttackConfig attack;
    private DamageConfig damage;
    private ExplosionConfig explosion;
    private ArmorToolConfig armorTool;
    private FoodConfig food;
    private PotionConfig potion;
    private ProjectileConfig projectile;
    private SwordBlockingConfig swordBlocking;

    PvPConfigBuilder() {
    }

    /**
     * Sets everything to the default settings for modern pvp (enables everything).
     *
     * @return this
     */
    public PvPConfigBuilder defaultOptions() {
        attack = AttackConfig.DEFAULT;
        damage = DamageConfig.DEFAULT;
        explosion = ExplosionConfig.DEFAULT;
        armorTool = ArmorToolConfig.DEFAULT;
        food = FoodConfig.DEFAULT;
        potion = PotionConfig.DEFAULT;
        projectile = ProjectileConfig.DEFAULT;
        swordBlocking = null;
        return this;
    }

    /**
     * Sets everything to the default settings for legacy pvp (enables everything).
     *
     * @return this
     */
    public PvPConfigBuilder legacyOptions() {
        attack = AttackConfig.LEGACY;
        damage = DamageConfig.LEGACY;
        explosion = ExplosionConfig.DEFAULT;
        armorTool = ArmorToolConfig.LEGACY;
        food = FoodConfig.LEGACY;
        potion = PotionConfig.LEGACY;
        projectile = ProjectileConfig.LEGACY;
        swordBlocking = SwordBlockingConfig.LEGACY;
        return this;
    }

    public PvPConfigBuilder attack(AttackConfig attack) {
        this.attack = attack;
        return this;
    }

    public PvPConfigBuilder attack(AttackConfigBuilder attack) {
        this.attack = attack.build();
        return this;
    }

    public PvPConfigBuilder damage(DamageConfig damage) {
        this.damage = damage;
        return this;
    }

    public PvPConfigBuilder damage(DamageConfigBuilder damage) {
        this.damage = damage.build();
        return this;
    }

    public PvPConfigBuilder explosion(ExplosionConfig explosion) {
        this.explosion = explosion;
        return this;
    }

    public PvPConfigBuilder explosion(ExplosionConfigBuilder explosion) {
        this.explosion = explosion.build();
        return this;
    }

    public PvPConfigBuilder armorTool(ArmorToolConfig armorTool) {
        this.armorTool = armorTool;
        return this;
    }

    public PvPConfigBuilder armorTool(ArmorToolConfigBuilder armorTool) {
        this.armorTool = armorTool.build();
        return this;
    }

    public PvPConfigBuilder food(FoodConfig food) {
        this.food = food;
        return this;
    }

    public PvPConfigBuilder food(FoodConfigBuilder food) {
        this.food = food.build();
        return this;
    }

    public PvPConfigBuilder potion(PotionConfig potion) {
        this.potion = potion;
        return this;
    }

    public PvPConfigBuilder potion(PotionConfigBuilder potion) {
        this.potion = potion.build();
        return this;
    }

    public PvPConfigBuilder projectile(ProjectileConfig projectile) {
        this.projectile = projectile;
        return this;
    }

    public PvPConfigBuilder projectile(ProjectileConfigBuilder projectile) {
        this.projectile = projectile.build();
        return this;
    }

    public PvPConfigBuilder swordBlocking(SwordBlockingConfig swordBlocking) {
        this.swordBlocking = swordBlocking;
        return this;
    }

    public PvPConfig build() {
        return new PvPConfig(
                attack, damage, explosion, armorTool,
                food, potion, projectile, swordBlocking
        );
    }
}
