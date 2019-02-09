/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct b3PhysicsSimulationParameters {
 *     double m_deltaTime;
 *     double m_gravityAcceleration[3];
 *     int m_numSimulationSubSteps;
 *     int m_numSolverIterations;
 *     int m_useRealTimeSimulation;
 *     int m_useSplitImpulse;
 *     double m_splitImpulsePenetrationThreshold;
 *     double m_contactBreakingThreshold;
 *     int m_internalSimFlags;
 *     double m_defaultContactERP;
 *     int m_collisionFilterMode;
 *     int m_enableFileCaching;
 *     double m_restitutionVelocityThreshold;
 *     double m_defaultNonContactERP;
 *     double m_frictionERP;
 *     double m_defaultGlobalCFM;
 *     double m_frictionCFM;
 *     int m_enableConeFriction;
 *     int m_deterministicOverlappingPairs;
 *     double m_allowedCcdPenetration;
 *     int m_jointFeedbackMode;
 *     double m_solverResidualThreshold;
 *     double m_contactSlop;
 *     int m_enableSAT;
 *     int m_constraintSolverType;
 *     int m_minimumSolverIslandSize;
 * }</code></pre>
 */
@NativeType("struct b3PhysicsSimulationParameters")
public class B3PhysicsSimulationParameters extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M_DELTATIME,
        M_GRAVITYACCELERATION,
        M_NUMSIMULATIONSUBSTEPS,
        M_NUMSOLVERITERATIONS,
        M_USEREALTIMESIMULATION,
        M_USESPLITIMPULSE,
        M_SPLITIMPULSEPENETRATIONTHRESHOLD,
        M_CONTACTBREAKINGTHRESHOLD,
        M_INTERNALSIMFLAGS,
        M_DEFAULTCONTACTERP,
        M_COLLISIONFILTERMODE,
        M_ENABLEFILECACHING,
        M_RESTITUTIONVELOCITYTHRESHOLD,
        M_DEFAULTNONCONTACTERP,
        M_FRICTIONERP,
        M_DEFAULTGLOBALCFM,
        M_FRICTIONCFM,
        M_ENABLECONEFRICTION,
        M_DETERMINISTICOVERLAPPINGPAIRS,
        M_ALLOWEDCCDPENETRATION,
        M_JOINTFEEDBACKMODE,
        M_SOLVERRESIDUALTHRESHOLD,
        M_CONTACTSLOP,
        M_ENABLESAT,
        M_CONSTRAINTSOLVERTYPE,
        M_MINIMUMSOLVERISLANDSIZE;

    static {
        Layout layout = __struct(
            __member(8),
            __array(8, 3),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(8),
            __member(8),
            __member(4),
            __member(8),
            __member(4),
            __member(4),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(4),
            __member(4),
            __member(8),
            __member(4),
            __member(8),
            __member(8),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M_DELTATIME = layout.offsetof(0);
        M_GRAVITYACCELERATION = layout.offsetof(1);
        M_NUMSIMULATIONSUBSTEPS = layout.offsetof(2);
        M_NUMSOLVERITERATIONS = layout.offsetof(3);
        M_USEREALTIMESIMULATION = layout.offsetof(4);
        M_USESPLITIMPULSE = layout.offsetof(5);
        M_SPLITIMPULSEPENETRATIONTHRESHOLD = layout.offsetof(6);
        M_CONTACTBREAKINGTHRESHOLD = layout.offsetof(7);
        M_INTERNALSIMFLAGS = layout.offsetof(8);
        M_DEFAULTCONTACTERP = layout.offsetof(9);
        M_COLLISIONFILTERMODE = layout.offsetof(10);
        M_ENABLEFILECACHING = layout.offsetof(11);
        M_RESTITUTIONVELOCITYTHRESHOLD = layout.offsetof(12);
        M_DEFAULTNONCONTACTERP = layout.offsetof(13);
        M_FRICTIONERP = layout.offsetof(14);
        M_DEFAULTGLOBALCFM = layout.offsetof(15);
        M_FRICTIONCFM = layout.offsetof(16);
        M_ENABLECONEFRICTION = layout.offsetof(17);
        M_DETERMINISTICOVERLAPPINGPAIRS = layout.offsetof(18);
        M_ALLOWEDCCDPENETRATION = layout.offsetof(19);
        M_JOINTFEEDBACKMODE = layout.offsetof(20);
        M_SOLVERRESIDUALTHRESHOLD = layout.offsetof(21);
        M_CONTACTSLOP = layout.offsetof(22);
        M_ENABLESAT = layout.offsetof(23);
        M_CONSTRAINTSOLVERTYPE = layout.offsetof(24);
        M_MINIMUMSOLVERISLANDSIZE = layout.offsetof(25);
    }

    /**
     * Creates a {@code B3PhysicsSimulationParameters} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public B3PhysicsSimulationParameters(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code m_deltaTime} field. */
    public double m_deltaTime() { return nm_deltaTime(address()); }
    /** Returns a {@link DoubleBuffer} view of the {@code m_gravityAcceleration} field. */
    @NativeType("double[3]")
    public DoubleBuffer m_gravityAcceleration() { return nm_gravityAcceleration(address()); }
    /** Returns the value at the specified index of the {@code m_gravityAcceleration} field. */
    public double m_gravityAcceleration(int index) { return nm_gravityAcceleration(address(), index); }
    /** Returns the value of the {@code m_numSimulationSubSteps} field. */
    public int m_numSimulationSubSteps() { return nm_numSimulationSubSteps(address()); }
    /** Returns the value of the {@code m_numSolverIterations} field. */
    public int m_numSolverIterations() { return nm_numSolverIterations(address()); }
    /** Returns the value of the {@code m_useRealTimeSimulation} field. */
    public int m_useRealTimeSimulation() { return nm_useRealTimeSimulation(address()); }
    /** Returns the value of the {@code m_useSplitImpulse} field. */
    public int m_useSplitImpulse() { return nm_useSplitImpulse(address()); }
    /** Returns the value of the {@code m_splitImpulsePenetrationThreshold} field. */
    public double m_splitImpulsePenetrationThreshold() { return nm_splitImpulsePenetrationThreshold(address()); }
    /** Returns the value of the {@code m_contactBreakingThreshold} field. */
    public double m_contactBreakingThreshold() { return nm_contactBreakingThreshold(address()); }
    /** Returns the value of the {@code m_internalSimFlags} field. */
    public int m_internalSimFlags() { return nm_internalSimFlags(address()); }
    /** Returns the value of the {@code m_defaultContactERP} field. */
    public double m_defaultContactERP() { return nm_defaultContactERP(address()); }
    /** Returns the value of the {@code m_collisionFilterMode} field. */
    public int m_collisionFilterMode() { return nm_collisionFilterMode(address()); }
    /** Returns the value of the {@code m_enableFileCaching} field. */
    public int m_enableFileCaching() { return nm_enableFileCaching(address()); }
    /** Returns the value of the {@code m_restitutionVelocityThreshold} field. */
    public double m_restitutionVelocityThreshold() { return nm_restitutionVelocityThreshold(address()); }
    /** Returns the value of the {@code m_defaultNonContactERP} field. */
    public double m_defaultNonContactERP() { return nm_defaultNonContactERP(address()); }
    /** Returns the value of the {@code m_frictionERP} field. */
    public double m_frictionERP() { return nm_frictionERP(address()); }
    /** Returns the value of the {@code m_defaultGlobalCFM} field. */
    public double m_defaultGlobalCFM() { return nm_defaultGlobalCFM(address()); }
    /** Returns the value of the {@code m_frictionCFM} field. */
    public double m_frictionCFM() { return nm_frictionCFM(address()); }
    /** Returns the value of the {@code m_enableConeFriction} field. */
    public int m_enableConeFriction() { return nm_enableConeFriction(address()); }
    /** Returns the value of the {@code m_deterministicOverlappingPairs} field. */
    public int m_deterministicOverlappingPairs() { return nm_deterministicOverlappingPairs(address()); }
    /** Returns the value of the {@code m_allowedCcdPenetration} field. */
    public double m_allowedCcdPenetration() { return nm_allowedCcdPenetration(address()); }
    /** Returns the value of the {@code m_jointFeedbackMode} field. */
    public int m_jointFeedbackMode() { return nm_jointFeedbackMode(address()); }
    /** Returns the value of the {@code m_solverResidualThreshold} field. */
    public double m_solverResidualThreshold() { return nm_solverResidualThreshold(address()); }
    /** Returns the value of the {@code m_contactSlop} field. */
    public double m_contactSlop() { return nm_contactSlop(address()); }
    /** Returns the value of the {@code m_enableSAT} field. */
    public int m_enableSAT() { return nm_enableSAT(address()); }
    /** Returns the value of the {@code m_constraintSolverType} field. */
    public int m_constraintSolverType() { return nm_constraintSolverType(address()); }
    /** Returns the value of the {@code m_minimumSolverIslandSize} field. */
    public int m_minimumSolverIslandSize() { return nm_minimumSolverIslandSize(address()); }

    /** Sets the specified value to the {@code m_deltaTime} field. */
    public B3PhysicsSimulationParameters m_deltaTime(double value) { nm_deltaTime(address(), value); return this; }
    /** Copies the specified {@link DoubleBuffer} to the {@code m_gravityAcceleration} field. */
    public B3PhysicsSimulationParameters m_gravityAcceleration(@NativeType("double[3]") DoubleBuffer value) { nm_gravityAcceleration(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_gravityAcceleration} field. */
    public B3PhysicsSimulationParameters m_gravityAcceleration(int index, double value) { nm_gravityAcceleration(address(), index, value); return this; }
    /** Sets the specified value to the {@code m_numSimulationSubSteps} field. */
    public B3PhysicsSimulationParameters m_numSimulationSubSteps(int value) { nm_numSimulationSubSteps(address(), value); return this; }
    /** Sets the specified value to the {@code m_numSolverIterations} field. */
    public B3PhysicsSimulationParameters m_numSolverIterations(int value) { nm_numSolverIterations(address(), value); return this; }
    /** Sets the specified value to the {@code m_useRealTimeSimulation} field. */
    public B3PhysicsSimulationParameters m_useRealTimeSimulation(int value) { nm_useRealTimeSimulation(address(), value); return this; }
    /** Sets the specified value to the {@code m_useSplitImpulse} field. */
    public B3PhysicsSimulationParameters m_useSplitImpulse(int value) { nm_useSplitImpulse(address(), value); return this; }
    /** Sets the specified value to the {@code m_splitImpulsePenetrationThreshold} field. */
    public B3PhysicsSimulationParameters m_splitImpulsePenetrationThreshold(double value) { nm_splitImpulsePenetrationThreshold(address(), value); return this; }
    /** Sets the specified value to the {@code m_contactBreakingThreshold} field. */
    public B3PhysicsSimulationParameters m_contactBreakingThreshold(double value) { nm_contactBreakingThreshold(address(), value); return this; }
    /** Sets the specified value to the {@code m_internalSimFlags} field. */
    public B3PhysicsSimulationParameters m_internalSimFlags(int value) { nm_internalSimFlags(address(), value); return this; }
    /** Sets the specified value to the {@code m_defaultContactERP} field. */
    public B3PhysicsSimulationParameters m_defaultContactERP(double value) { nm_defaultContactERP(address(), value); return this; }
    /** Sets the specified value to the {@code m_collisionFilterMode} field. */
    public B3PhysicsSimulationParameters m_collisionFilterMode(int value) { nm_collisionFilterMode(address(), value); return this; }
    /** Sets the specified value to the {@code m_enableFileCaching} field. */
    public B3PhysicsSimulationParameters m_enableFileCaching(int value) { nm_enableFileCaching(address(), value); return this; }
    /** Sets the specified value to the {@code m_restitutionVelocityThreshold} field. */
    public B3PhysicsSimulationParameters m_restitutionVelocityThreshold(double value) { nm_restitutionVelocityThreshold(address(), value); return this; }
    /** Sets the specified value to the {@code m_defaultNonContactERP} field. */
    public B3PhysicsSimulationParameters m_defaultNonContactERP(double value) { nm_defaultNonContactERP(address(), value); return this; }
    /** Sets the specified value to the {@code m_frictionERP} field. */
    public B3PhysicsSimulationParameters m_frictionERP(double value) { nm_frictionERP(address(), value); return this; }
    /** Sets the specified value to the {@code m_defaultGlobalCFM} field. */
    public B3PhysicsSimulationParameters m_defaultGlobalCFM(double value) { nm_defaultGlobalCFM(address(), value); return this; }
    /** Sets the specified value to the {@code m_frictionCFM} field. */
    public B3PhysicsSimulationParameters m_frictionCFM(double value) { nm_frictionCFM(address(), value); return this; }
    /** Sets the specified value to the {@code m_enableConeFriction} field. */
    public B3PhysicsSimulationParameters m_enableConeFriction(int value) { nm_enableConeFriction(address(), value); return this; }
    /** Sets the specified value to the {@code m_deterministicOverlappingPairs} field. */
    public B3PhysicsSimulationParameters m_deterministicOverlappingPairs(int value) { nm_deterministicOverlappingPairs(address(), value); return this; }
    /** Sets the specified value to the {@code m_allowedCcdPenetration} field. */
    public B3PhysicsSimulationParameters m_allowedCcdPenetration(double value) { nm_allowedCcdPenetration(address(), value); return this; }
    /** Sets the specified value to the {@code m_jointFeedbackMode} field. */
    public B3PhysicsSimulationParameters m_jointFeedbackMode(int value) { nm_jointFeedbackMode(address(), value); return this; }
    /** Sets the specified value to the {@code m_solverResidualThreshold} field. */
    public B3PhysicsSimulationParameters m_solverResidualThreshold(double value) { nm_solverResidualThreshold(address(), value); return this; }
    /** Sets the specified value to the {@code m_contactSlop} field. */
    public B3PhysicsSimulationParameters m_contactSlop(double value) { nm_contactSlop(address(), value); return this; }
    /** Sets the specified value to the {@code m_enableSAT} field. */
    public B3PhysicsSimulationParameters m_enableSAT(int value) { nm_enableSAT(address(), value); return this; }
    /** Sets the specified value to the {@code m_constraintSolverType} field. */
    public B3PhysicsSimulationParameters m_constraintSolverType(int value) { nm_constraintSolverType(address(), value); return this; }
    /** Sets the specified value to the {@code m_minimumSolverIslandSize} field. */
    public B3PhysicsSimulationParameters m_minimumSolverIslandSize(int value) { nm_minimumSolverIslandSize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public B3PhysicsSimulationParameters set(
        double m_deltaTime,
        DoubleBuffer m_gravityAcceleration,
        int m_numSimulationSubSteps,
        int m_numSolverIterations,
        int m_useRealTimeSimulation,
        int m_useSplitImpulse,
        double m_splitImpulsePenetrationThreshold,
        double m_contactBreakingThreshold,
        int m_internalSimFlags,
        double m_defaultContactERP,
        int m_collisionFilterMode,
        int m_enableFileCaching,
        double m_restitutionVelocityThreshold,
        double m_defaultNonContactERP,
        double m_frictionERP,
        double m_defaultGlobalCFM,
        double m_frictionCFM,
        int m_enableConeFriction,
        int m_deterministicOverlappingPairs,
        double m_allowedCcdPenetration,
        int m_jointFeedbackMode,
        double m_solverResidualThreshold,
        double m_contactSlop,
        int m_enableSAT,
        int m_constraintSolverType,
        int m_minimumSolverIslandSize
    ) {
        m_deltaTime(m_deltaTime);
        m_gravityAcceleration(m_gravityAcceleration);
        m_numSimulationSubSteps(m_numSimulationSubSteps);
        m_numSolverIterations(m_numSolverIterations);
        m_useRealTimeSimulation(m_useRealTimeSimulation);
        m_useSplitImpulse(m_useSplitImpulse);
        m_splitImpulsePenetrationThreshold(m_splitImpulsePenetrationThreshold);
        m_contactBreakingThreshold(m_contactBreakingThreshold);
        m_internalSimFlags(m_internalSimFlags);
        m_defaultContactERP(m_defaultContactERP);
        m_collisionFilterMode(m_collisionFilterMode);
        m_enableFileCaching(m_enableFileCaching);
        m_restitutionVelocityThreshold(m_restitutionVelocityThreshold);
        m_defaultNonContactERP(m_defaultNonContactERP);
        m_frictionERP(m_frictionERP);
        m_defaultGlobalCFM(m_defaultGlobalCFM);
        m_frictionCFM(m_frictionCFM);
        m_enableConeFriction(m_enableConeFriction);
        m_deterministicOverlappingPairs(m_deterministicOverlappingPairs);
        m_allowedCcdPenetration(m_allowedCcdPenetration);
        m_jointFeedbackMode(m_jointFeedbackMode);
        m_solverResidualThreshold(m_solverResidualThreshold);
        m_contactSlop(m_contactSlop);
        m_enableSAT(m_enableSAT);
        m_constraintSolverType(m_constraintSolverType);
        m_minimumSolverIslandSize(m_minimumSolverIslandSize);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public B3PhysicsSimulationParameters set(B3PhysicsSimulationParameters src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code B3PhysicsSimulationParameters} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static B3PhysicsSimulationParameters malloc() {
        return wrap(B3PhysicsSimulationParameters.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code B3PhysicsSimulationParameters} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static B3PhysicsSimulationParameters calloc() {
        return wrap(B3PhysicsSimulationParameters.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code B3PhysicsSimulationParameters} instance allocated with {@link BufferUtils}. */
    public static B3PhysicsSimulationParameters create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(B3PhysicsSimulationParameters.class, memAddress(container), container);
    }

    /** Returns a new {@code B3PhysicsSimulationParameters} instance for the specified memory address. */
    public static B3PhysicsSimulationParameters create(long address) {
        return wrap(B3PhysicsSimulationParameters.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3PhysicsSimulationParameters createSafe(long address) {
        return address == NULL ? null : wrap(B3PhysicsSimulationParameters.class, address);
    }

    /**
     * Returns a new {@link B3PhysicsSimulationParameters.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3PhysicsSimulationParameters.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link B3PhysicsSimulationParameters.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3PhysicsSimulationParameters.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3PhysicsSimulationParameters.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static B3PhysicsSimulationParameters.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link B3PhysicsSimulationParameters.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static B3PhysicsSimulationParameters.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3PhysicsSimulationParameters.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code B3PhysicsSimulationParameters} instance allocated on the thread-local {@link MemoryStack}. */
    public static B3PhysicsSimulationParameters mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code B3PhysicsSimulationParameters} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static B3PhysicsSimulationParameters callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code B3PhysicsSimulationParameters} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static B3PhysicsSimulationParameters mallocStack(MemoryStack stack) {
        return wrap(B3PhysicsSimulationParameters.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code B3PhysicsSimulationParameters} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static B3PhysicsSimulationParameters callocStack(MemoryStack stack) {
        return wrap(B3PhysicsSimulationParameters.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link B3PhysicsSimulationParameters.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static B3PhysicsSimulationParameters.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3PhysicsSimulationParameters.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static B3PhysicsSimulationParameters.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3PhysicsSimulationParameters.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3PhysicsSimulationParameters.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3PhysicsSimulationParameters.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3PhysicsSimulationParameters.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_deltaTime}. */
    public static double nm_deltaTime(long struct) { return UNSAFE.getDouble(null, struct + B3PhysicsSimulationParameters.M_DELTATIME); }
    /** Unsafe version of {@link #m_gravityAcceleration}. */
    public static DoubleBuffer nm_gravityAcceleration(long struct) { return memDoubleBuffer(struct + B3PhysicsSimulationParameters.M_GRAVITYACCELERATION, 3); }
    /** Unsafe version of {@link #m_gravityAcceleration(int) m_gravityAcceleration}. */
    public static double nm_gravityAcceleration(long struct, int index) {
        return UNSAFE.getDouble(null, struct + B3PhysicsSimulationParameters.M_GRAVITYACCELERATION + check(index, 3) * 8);
    }
    /** Unsafe version of {@link #m_numSimulationSubSteps}. */
    public static int nm_numSimulationSubSteps(long struct) { return UNSAFE.getInt(null, struct + B3PhysicsSimulationParameters.M_NUMSIMULATIONSUBSTEPS); }
    /** Unsafe version of {@link #m_numSolverIterations}. */
    public static int nm_numSolverIterations(long struct) { return UNSAFE.getInt(null, struct + B3PhysicsSimulationParameters.M_NUMSOLVERITERATIONS); }
    /** Unsafe version of {@link #m_useRealTimeSimulation}. */
    public static int nm_useRealTimeSimulation(long struct) { return UNSAFE.getInt(null, struct + B3PhysicsSimulationParameters.M_USEREALTIMESIMULATION); }
    /** Unsafe version of {@link #m_useSplitImpulse}. */
    public static int nm_useSplitImpulse(long struct) { return UNSAFE.getInt(null, struct + B3PhysicsSimulationParameters.M_USESPLITIMPULSE); }
    /** Unsafe version of {@link #m_splitImpulsePenetrationThreshold}. */
    public static double nm_splitImpulsePenetrationThreshold(long struct) { return UNSAFE.getDouble(null, struct + B3PhysicsSimulationParameters.M_SPLITIMPULSEPENETRATIONTHRESHOLD); }
    /** Unsafe version of {@link #m_contactBreakingThreshold}. */
    public static double nm_contactBreakingThreshold(long struct) { return UNSAFE.getDouble(null, struct + B3PhysicsSimulationParameters.M_CONTACTBREAKINGTHRESHOLD); }
    /** Unsafe version of {@link #m_internalSimFlags}. */
    public static int nm_internalSimFlags(long struct) { return UNSAFE.getInt(null, struct + B3PhysicsSimulationParameters.M_INTERNALSIMFLAGS); }
    /** Unsafe version of {@link #m_defaultContactERP}. */
    public static double nm_defaultContactERP(long struct) { return UNSAFE.getDouble(null, struct + B3PhysicsSimulationParameters.M_DEFAULTCONTACTERP); }
    /** Unsafe version of {@link #m_collisionFilterMode}. */
    public static int nm_collisionFilterMode(long struct) { return UNSAFE.getInt(null, struct + B3PhysicsSimulationParameters.M_COLLISIONFILTERMODE); }
    /** Unsafe version of {@link #m_enableFileCaching}. */
    public static int nm_enableFileCaching(long struct) { return UNSAFE.getInt(null, struct + B3PhysicsSimulationParameters.M_ENABLEFILECACHING); }
    /** Unsafe version of {@link #m_restitutionVelocityThreshold}. */
    public static double nm_restitutionVelocityThreshold(long struct) { return UNSAFE.getDouble(null, struct + B3PhysicsSimulationParameters.M_RESTITUTIONVELOCITYTHRESHOLD); }
    /** Unsafe version of {@link #m_defaultNonContactERP}. */
    public static double nm_defaultNonContactERP(long struct) { return UNSAFE.getDouble(null, struct + B3PhysicsSimulationParameters.M_DEFAULTNONCONTACTERP); }
    /** Unsafe version of {@link #m_frictionERP}. */
    public static double nm_frictionERP(long struct) { return UNSAFE.getDouble(null, struct + B3PhysicsSimulationParameters.M_FRICTIONERP); }
    /** Unsafe version of {@link #m_defaultGlobalCFM}. */
    public static double nm_defaultGlobalCFM(long struct) { return UNSAFE.getDouble(null, struct + B3PhysicsSimulationParameters.M_DEFAULTGLOBALCFM); }
    /** Unsafe version of {@link #m_frictionCFM}. */
    public static double nm_frictionCFM(long struct) { return UNSAFE.getDouble(null, struct + B3PhysicsSimulationParameters.M_FRICTIONCFM); }
    /** Unsafe version of {@link #m_enableConeFriction}. */
    public static int nm_enableConeFriction(long struct) { return UNSAFE.getInt(null, struct + B3PhysicsSimulationParameters.M_ENABLECONEFRICTION); }
    /** Unsafe version of {@link #m_deterministicOverlappingPairs}. */
    public static int nm_deterministicOverlappingPairs(long struct) { return UNSAFE.getInt(null, struct + B3PhysicsSimulationParameters.M_DETERMINISTICOVERLAPPINGPAIRS); }
    /** Unsafe version of {@link #m_allowedCcdPenetration}. */
    public static double nm_allowedCcdPenetration(long struct) { return UNSAFE.getDouble(null, struct + B3PhysicsSimulationParameters.M_ALLOWEDCCDPENETRATION); }
    /** Unsafe version of {@link #m_jointFeedbackMode}. */
    public static int nm_jointFeedbackMode(long struct) { return UNSAFE.getInt(null, struct + B3PhysicsSimulationParameters.M_JOINTFEEDBACKMODE); }
    /** Unsafe version of {@link #m_solverResidualThreshold}. */
    public static double nm_solverResidualThreshold(long struct) { return UNSAFE.getDouble(null, struct + B3PhysicsSimulationParameters.M_SOLVERRESIDUALTHRESHOLD); }
    /** Unsafe version of {@link #m_contactSlop}. */
    public static double nm_contactSlop(long struct) { return UNSAFE.getDouble(null, struct + B3PhysicsSimulationParameters.M_CONTACTSLOP); }
    /** Unsafe version of {@link #m_enableSAT}. */
    public static int nm_enableSAT(long struct) { return UNSAFE.getInt(null, struct + B3PhysicsSimulationParameters.M_ENABLESAT); }
    /** Unsafe version of {@link #m_constraintSolverType}. */
    public static int nm_constraintSolverType(long struct) { return UNSAFE.getInt(null, struct + B3PhysicsSimulationParameters.M_CONSTRAINTSOLVERTYPE); }
    /** Unsafe version of {@link #m_minimumSolverIslandSize}. */
    public static int nm_minimumSolverIslandSize(long struct) { return UNSAFE.getInt(null, struct + B3PhysicsSimulationParameters.M_MINIMUMSOLVERISLANDSIZE); }

    /** Unsafe version of {@link #m_deltaTime(double) m_deltaTime}. */
    public static void nm_deltaTime(long struct, double value) { UNSAFE.putDouble(null, struct + B3PhysicsSimulationParameters.M_DELTATIME, value); }
    /** Unsafe version of {@link #m_gravityAcceleration(DoubleBuffer) m_gravityAcceleration}. */
    public static void nm_gravityAcceleration(long struct, DoubleBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + B3PhysicsSimulationParameters.M_GRAVITYACCELERATION, value.remaining() * 8);
    }
    /** Unsafe version of {@link #m_gravityAcceleration(int, double) m_gravityAcceleration}. */
    public static void nm_gravityAcceleration(long struct, int index, double value) {
        UNSAFE.putDouble(null, struct + B3PhysicsSimulationParameters.M_GRAVITYACCELERATION + check(index, 3) * 8, value);
    }
    /** Unsafe version of {@link #m_numSimulationSubSteps(int) m_numSimulationSubSteps}. */
    public static void nm_numSimulationSubSteps(long struct, int value) { UNSAFE.putInt(null, struct + B3PhysicsSimulationParameters.M_NUMSIMULATIONSUBSTEPS, value); }
    /** Unsafe version of {@link #m_numSolverIterations(int) m_numSolverIterations}. */
    public static void nm_numSolverIterations(long struct, int value) { UNSAFE.putInt(null, struct + B3PhysicsSimulationParameters.M_NUMSOLVERITERATIONS, value); }
    /** Unsafe version of {@link #m_useRealTimeSimulation(int) m_useRealTimeSimulation}. */
    public static void nm_useRealTimeSimulation(long struct, int value) { UNSAFE.putInt(null, struct + B3PhysicsSimulationParameters.M_USEREALTIMESIMULATION, value); }
    /** Unsafe version of {@link #m_useSplitImpulse(int) m_useSplitImpulse}. */
    public static void nm_useSplitImpulse(long struct, int value) { UNSAFE.putInt(null, struct + B3PhysicsSimulationParameters.M_USESPLITIMPULSE, value); }
    /** Unsafe version of {@link #m_splitImpulsePenetrationThreshold(double) m_splitImpulsePenetrationThreshold}. */
    public static void nm_splitImpulsePenetrationThreshold(long struct, double value) { UNSAFE.putDouble(null, struct + B3PhysicsSimulationParameters.M_SPLITIMPULSEPENETRATIONTHRESHOLD, value); }
    /** Unsafe version of {@link #m_contactBreakingThreshold(double) m_contactBreakingThreshold}. */
    public static void nm_contactBreakingThreshold(long struct, double value) { UNSAFE.putDouble(null, struct + B3PhysicsSimulationParameters.M_CONTACTBREAKINGTHRESHOLD, value); }
    /** Unsafe version of {@link #m_internalSimFlags(int) m_internalSimFlags}. */
    public static void nm_internalSimFlags(long struct, int value) { UNSAFE.putInt(null, struct + B3PhysicsSimulationParameters.M_INTERNALSIMFLAGS, value); }
    /** Unsafe version of {@link #m_defaultContactERP(double) m_defaultContactERP}. */
    public static void nm_defaultContactERP(long struct, double value) { UNSAFE.putDouble(null, struct + B3PhysicsSimulationParameters.M_DEFAULTCONTACTERP, value); }
    /** Unsafe version of {@link #m_collisionFilterMode(int) m_collisionFilterMode}. */
    public static void nm_collisionFilterMode(long struct, int value) { UNSAFE.putInt(null, struct + B3PhysicsSimulationParameters.M_COLLISIONFILTERMODE, value); }
    /** Unsafe version of {@link #m_enableFileCaching(int) m_enableFileCaching}. */
    public static void nm_enableFileCaching(long struct, int value) { UNSAFE.putInt(null, struct + B3PhysicsSimulationParameters.M_ENABLEFILECACHING, value); }
    /** Unsafe version of {@link #m_restitutionVelocityThreshold(double) m_restitutionVelocityThreshold}. */
    public static void nm_restitutionVelocityThreshold(long struct, double value) { UNSAFE.putDouble(null, struct + B3PhysicsSimulationParameters.M_RESTITUTIONVELOCITYTHRESHOLD, value); }
    /** Unsafe version of {@link #m_defaultNonContactERP(double) m_defaultNonContactERP}. */
    public static void nm_defaultNonContactERP(long struct, double value) { UNSAFE.putDouble(null, struct + B3PhysicsSimulationParameters.M_DEFAULTNONCONTACTERP, value); }
    /** Unsafe version of {@link #m_frictionERP(double) m_frictionERP}. */
    public static void nm_frictionERP(long struct, double value) { UNSAFE.putDouble(null, struct + B3PhysicsSimulationParameters.M_FRICTIONERP, value); }
    /** Unsafe version of {@link #m_defaultGlobalCFM(double) m_defaultGlobalCFM}. */
    public static void nm_defaultGlobalCFM(long struct, double value) { UNSAFE.putDouble(null, struct + B3PhysicsSimulationParameters.M_DEFAULTGLOBALCFM, value); }
    /** Unsafe version of {@link #m_frictionCFM(double) m_frictionCFM}. */
    public static void nm_frictionCFM(long struct, double value) { UNSAFE.putDouble(null, struct + B3PhysicsSimulationParameters.M_FRICTIONCFM, value); }
    /** Unsafe version of {@link #m_enableConeFriction(int) m_enableConeFriction}. */
    public static void nm_enableConeFriction(long struct, int value) { UNSAFE.putInt(null, struct + B3PhysicsSimulationParameters.M_ENABLECONEFRICTION, value); }
    /** Unsafe version of {@link #m_deterministicOverlappingPairs(int) m_deterministicOverlappingPairs}. */
    public static void nm_deterministicOverlappingPairs(long struct, int value) { UNSAFE.putInt(null, struct + B3PhysicsSimulationParameters.M_DETERMINISTICOVERLAPPINGPAIRS, value); }
    /** Unsafe version of {@link #m_allowedCcdPenetration(double) m_allowedCcdPenetration}. */
    public static void nm_allowedCcdPenetration(long struct, double value) { UNSAFE.putDouble(null, struct + B3PhysicsSimulationParameters.M_ALLOWEDCCDPENETRATION, value); }
    /** Unsafe version of {@link #m_jointFeedbackMode(int) m_jointFeedbackMode}. */
    public static void nm_jointFeedbackMode(long struct, int value) { UNSAFE.putInt(null, struct + B3PhysicsSimulationParameters.M_JOINTFEEDBACKMODE, value); }
    /** Unsafe version of {@link #m_solverResidualThreshold(double) m_solverResidualThreshold}. */
    public static void nm_solverResidualThreshold(long struct, double value) { UNSAFE.putDouble(null, struct + B3PhysicsSimulationParameters.M_SOLVERRESIDUALTHRESHOLD, value); }
    /** Unsafe version of {@link #m_contactSlop(double) m_contactSlop}. */
    public static void nm_contactSlop(long struct, double value) { UNSAFE.putDouble(null, struct + B3PhysicsSimulationParameters.M_CONTACTSLOP, value); }
    /** Unsafe version of {@link #m_enableSAT(int) m_enableSAT}. */
    public static void nm_enableSAT(long struct, int value) { UNSAFE.putInt(null, struct + B3PhysicsSimulationParameters.M_ENABLESAT, value); }
    /** Unsafe version of {@link #m_constraintSolverType(int) m_constraintSolverType}. */
    public static void nm_constraintSolverType(long struct, int value) { UNSAFE.putInt(null, struct + B3PhysicsSimulationParameters.M_CONSTRAINTSOLVERTYPE, value); }
    /** Unsafe version of {@link #m_minimumSolverIslandSize(int) m_minimumSolverIslandSize}. */
    public static void nm_minimumSolverIslandSize(long struct, int value) { UNSAFE.putInt(null, struct + B3PhysicsSimulationParameters.M_MINIMUMSOLVERISLANDSIZE, value); }

    // -----------------------------------

    /** An array of {@link B3PhysicsSimulationParameters} structs. */
    public static class Buffer extends StructBuffer<B3PhysicsSimulationParameters, Buffer> implements NativeResource {

        private static final B3PhysicsSimulationParameters ELEMENT_FACTORY = B3PhysicsSimulationParameters.create(-1L);

        /**
         * Creates a new {@code B3PhysicsSimulationParameters.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link B3PhysicsSimulationParameters#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected B3PhysicsSimulationParameters getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code m_deltaTime} field. */
        public double m_deltaTime() { return B3PhysicsSimulationParameters.nm_deltaTime(address()); }
        /** Returns a {@link DoubleBuffer} view of the {@code m_gravityAcceleration} field. */
        @NativeType("double[3]")
        public DoubleBuffer m_gravityAcceleration() { return B3PhysicsSimulationParameters.nm_gravityAcceleration(address()); }
        /** Returns the value at the specified index of the {@code m_gravityAcceleration} field. */
        public double m_gravityAcceleration(int index) { return B3PhysicsSimulationParameters.nm_gravityAcceleration(address(), index); }
        /** Returns the value of the {@code m_numSimulationSubSteps} field. */
        public int m_numSimulationSubSteps() { return B3PhysicsSimulationParameters.nm_numSimulationSubSteps(address()); }
        /** Returns the value of the {@code m_numSolverIterations} field. */
        public int m_numSolverIterations() { return B3PhysicsSimulationParameters.nm_numSolverIterations(address()); }
        /** Returns the value of the {@code m_useRealTimeSimulation} field. */
        public int m_useRealTimeSimulation() { return B3PhysicsSimulationParameters.nm_useRealTimeSimulation(address()); }
        /** Returns the value of the {@code m_useSplitImpulse} field. */
        public int m_useSplitImpulse() { return B3PhysicsSimulationParameters.nm_useSplitImpulse(address()); }
        /** Returns the value of the {@code m_splitImpulsePenetrationThreshold} field. */
        public double m_splitImpulsePenetrationThreshold() { return B3PhysicsSimulationParameters.nm_splitImpulsePenetrationThreshold(address()); }
        /** Returns the value of the {@code m_contactBreakingThreshold} field. */
        public double m_contactBreakingThreshold() { return B3PhysicsSimulationParameters.nm_contactBreakingThreshold(address()); }
        /** Returns the value of the {@code m_internalSimFlags} field. */
        public int m_internalSimFlags() { return B3PhysicsSimulationParameters.nm_internalSimFlags(address()); }
        /** Returns the value of the {@code m_defaultContactERP} field. */
        public double m_defaultContactERP() { return B3PhysicsSimulationParameters.nm_defaultContactERP(address()); }
        /** Returns the value of the {@code m_collisionFilterMode} field. */
        public int m_collisionFilterMode() { return B3PhysicsSimulationParameters.nm_collisionFilterMode(address()); }
        /** Returns the value of the {@code m_enableFileCaching} field. */
        public int m_enableFileCaching() { return B3PhysicsSimulationParameters.nm_enableFileCaching(address()); }
        /** Returns the value of the {@code m_restitutionVelocityThreshold} field. */
        public double m_restitutionVelocityThreshold() { return B3PhysicsSimulationParameters.nm_restitutionVelocityThreshold(address()); }
        /** Returns the value of the {@code m_defaultNonContactERP} field. */
        public double m_defaultNonContactERP() { return B3PhysicsSimulationParameters.nm_defaultNonContactERP(address()); }
        /** Returns the value of the {@code m_frictionERP} field. */
        public double m_frictionERP() { return B3PhysicsSimulationParameters.nm_frictionERP(address()); }
        /** Returns the value of the {@code m_defaultGlobalCFM} field. */
        public double m_defaultGlobalCFM() { return B3PhysicsSimulationParameters.nm_defaultGlobalCFM(address()); }
        /** Returns the value of the {@code m_frictionCFM} field. */
        public double m_frictionCFM() { return B3PhysicsSimulationParameters.nm_frictionCFM(address()); }
        /** Returns the value of the {@code m_enableConeFriction} field. */
        public int m_enableConeFriction() { return B3PhysicsSimulationParameters.nm_enableConeFriction(address()); }
        /** Returns the value of the {@code m_deterministicOverlappingPairs} field. */
        public int m_deterministicOverlappingPairs() { return B3PhysicsSimulationParameters.nm_deterministicOverlappingPairs(address()); }
        /** Returns the value of the {@code m_allowedCcdPenetration} field. */
        public double m_allowedCcdPenetration() { return B3PhysicsSimulationParameters.nm_allowedCcdPenetration(address()); }
        /** Returns the value of the {@code m_jointFeedbackMode} field. */
        public int m_jointFeedbackMode() { return B3PhysicsSimulationParameters.nm_jointFeedbackMode(address()); }
        /** Returns the value of the {@code m_solverResidualThreshold} field. */
        public double m_solverResidualThreshold() { return B3PhysicsSimulationParameters.nm_solverResidualThreshold(address()); }
        /** Returns the value of the {@code m_contactSlop} field. */
        public double m_contactSlop() { return B3PhysicsSimulationParameters.nm_contactSlop(address()); }
        /** Returns the value of the {@code m_enableSAT} field. */
        public int m_enableSAT() { return B3PhysicsSimulationParameters.nm_enableSAT(address()); }
        /** Returns the value of the {@code m_constraintSolverType} field. */
        public int m_constraintSolverType() { return B3PhysicsSimulationParameters.nm_constraintSolverType(address()); }
        /** Returns the value of the {@code m_minimumSolverIslandSize} field. */
        public int m_minimumSolverIslandSize() { return B3PhysicsSimulationParameters.nm_minimumSolverIslandSize(address()); }

        /** Sets the specified value to the {@code m_deltaTime} field. */
        public B3PhysicsSimulationParameters.Buffer m_deltaTime(double value) { B3PhysicsSimulationParameters.nm_deltaTime(address(), value); return this; }
        /** Copies the specified {@link DoubleBuffer} to the {@code m_gravityAcceleration} field. */
        public B3PhysicsSimulationParameters.Buffer m_gravityAcceleration(@NativeType("double[3]") DoubleBuffer value) { B3PhysicsSimulationParameters.nm_gravityAcceleration(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_gravityAcceleration} field. */
        public B3PhysicsSimulationParameters.Buffer m_gravityAcceleration(int index, double value) { B3PhysicsSimulationParameters.nm_gravityAcceleration(address(), index, value); return this; }
        /** Sets the specified value to the {@code m_numSimulationSubSteps} field. */
        public B3PhysicsSimulationParameters.Buffer m_numSimulationSubSteps(int value) { B3PhysicsSimulationParameters.nm_numSimulationSubSteps(address(), value); return this; }
        /** Sets the specified value to the {@code m_numSolverIterations} field. */
        public B3PhysicsSimulationParameters.Buffer m_numSolverIterations(int value) { B3PhysicsSimulationParameters.nm_numSolverIterations(address(), value); return this; }
        /** Sets the specified value to the {@code m_useRealTimeSimulation} field. */
        public B3PhysicsSimulationParameters.Buffer m_useRealTimeSimulation(int value) { B3PhysicsSimulationParameters.nm_useRealTimeSimulation(address(), value); return this; }
        /** Sets the specified value to the {@code m_useSplitImpulse} field. */
        public B3PhysicsSimulationParameters.Buffer m_useSplitImpulse(int value) { B3PhysicsSimulationParameters.nm_useSplitImpulse(address(), value); return this; }
        /** Sets the specified value to the {@code m_splitImpulsePenetrationThreshold} field. */
        public B3PhysicsSimulationParameters.Buffer m_splitImpulsePenetrationThreshold(double value) { B3PhysicsSimulationParameters.nm_splitImpulsePenetrationThreshold(address(), value); return this; }
        /** Sets the specified value to the {@code m_contactBreakingThreshold} field. */
        public B3PhysicsSimulationParameters.Buffer m_contactBreakingThreshold(double value) { B3PhysicsSimulationParameters.nm_contactBreakingThreshold(address(), value); return this; }
        /** Sets the specified value to the {@code m_internalSimFlags} field. */
        public B3PhysicsSimulationParameters.Buffer m_internalSimFlags(int value) { B3PhysicsSimulationParameters.nm_internalSimFlags(address(), value); return this; }
        /** Sets the specified value to the {@code m_defaultContactERP} field. */
        public B3PhysicsSimulationParameters.Buffer m_defaultContactERP(double value) { B3PhysicsSimulationParameters.nm_defaultContactERP(address(), value); return this; }
        /** Sets the specified value to the {@code m_collisionFilterMode} field. */
        public B3PhysicsSimulationParameters.Buffer m_collisionFilterMode(int value) { B3PhysicsSimulationParameters.nm_collisionFilterMode(address(), value); return this; }
        /** Sets the specified value to the {@code m_enableFileCaching} field. */
        public B3PhysicsSimulationParameters.Buffer m_enableFileCaching(int value) { B3PhysicsSimulationParameters.nm_enableFileCaching(address(), value); return this; }
        /** Sets the specified value to the {@code m_restitutionVelocityThreshold} field. */
        public B3PhysicsSimulationParameters.Buffer m_restitutionVelocityThreshold(double value) { B3PhysicsSimulationParameters.nm_restitutionVelocityThreshold(address(), value); return this; }
        /** Sets the specified value to the {@code m_defaultNonContactERP} field. */
        public B3PhysicsSimulationParameters.Buffer m_defaultNonContactERP(double value) { B3PhysicsSimulationParameters.nm_defaultNonContactERP(address(), value); return this; }
        /** Sets the specified value to the {@code m_frictionERP} field. */
        public B3PhysicsSimulationParameters.Buffer m_frictionERP(double value) { B3PhysicsSimulationParameters.nm_frictionERP(address(), value); return this; }
        /** Sets the specified value to the {@code m_defaultGlobalCFM} field. */
        public B3PhysicsSimulationParameters.Buffer m_defaultGlobalCFM(double value) { B3PhysicsSimulationParameters.nm_defaultGlobalCFM(address(), value); return this; }
        /** Sets the specified value to the {@code m_frictionCFM} field. */
        public B3PhysicsSimulationParameters.Buffer m_frictionCFM(double value) { B3PhysicsSimulationParameters.nm_frictionCFM(address(), value); return this; }
        /** Sets the specified value to the {@code m_enableConeFriction} field. */
        public B3PhysicsSimulationParameters.Buffer m_enableConeFriction(int value) { B3PhysicsSimulationParameters.nm_enableConeFriction(address(), value); return this; }
        /** Sets the specified value to the {@code m_deterministicOverlappingPairs} field. */
        public B3PhysicsSimulationParameters.Buffer m_deterministicOverlappingPairs(int value) { B3PhysicsSimulationParameters.nm_deterministicOverlappingPairs(address(), value); return this; }
        /** Sets the specified value to the {@code m_allowedCcdPenetration} field. */
        public B3PhysicsSimulationParameters.Buffer m_allowedCcdPenetration(double value) { B3PhysicsSimulationParameters.nm_allowedCcdPenetration(address(), value); return this; }
        /** Sets the specified value to the {@code m_jointFeedbackMode} field. */
        public B3PhysicsSimulationParameters.Buffer m_jointFeedbackMode(int value) { B3PhysicsSimulationParameters.nm_jointFeedbackMode(address(), value); return this; }
        /** Sets the specified value to the {@code m_solverResidualThreshold} field. */
        public B3PhysicsSimulationParameters.Buffer m_solverResidualThreshold(double value) { B3PhysicsSimulationParameters.nm_solverResidualThreshold(address(), value); return this; }
        /** Sets the specified value to the {@code m_contactSlop} field. */
        public B3PhysicsSimulationParameters.Buffer m_contactSlop(double value) { B3PhysicsSimulationParameters.nm_contactSlop(address(), value); return this; }
        /** Sets the specified value to the {@code m_enableSAT} field. */
        public B3PhysicsSimulationParameters.Buffer m_enableSAT(int value) { B3PhysicsSimulationParameters.nm_enableSAT(address(), value); return this; }
        /** Sets the specified value to the {@code m_constraintSolverType} field. */
        public B3PhysicsSimulationParameters.Buffer m_constraintSolverType(int value) { B3PhysicsSimulationParameters.nm_constraintSolverType(address(), value); return this; }
        /** Sets the specified value to the {@code m_minimumSolverIslandSize} field. */
        public B3PhysicsSimulationParameters.Buffer m_minimumSolverIslandSize(int value) { B3PhysicsSimulationParameters.nm_minimumSolverIslandSize(address(), value); return this; }

    }

}