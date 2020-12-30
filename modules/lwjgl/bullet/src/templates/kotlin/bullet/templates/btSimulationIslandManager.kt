/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btSimulationIslandManager = "BTSimulationIslandManager".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    void(
        "SimulationIslandManager_IslandCallback_processIsland",
        "",

        opaque_p("obj", ""),
        opaque_p.p("bodies", ""),
        AutoSize("bodies")..int("numBodies", ""),
        opaque_p.p("manifolds", ""),
        AutoSize("manifolds")..int("numManifolds", ""),
        int("islandId", "")
    )

    void(
        "SimulationIslandManager_IslandCallback_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SimulationIslandManager_new",
        "",

        void()
    )

    void(
        "SimulationIslandManager_buildAndProcessIslands",
        "",

        opaque_p("obj", ""),
        opaque_p("dispatcher", ""),
        opaque_p("collisionWorld", ""),
        opaque_p("callback", "")
    )

    void(
        "SimulationIslandManager_buildIslands",
        "",

        opaque_p("obj", ""),
        opaque_p("dispatcher", ""),
        opaque_p("colWorld", "")
    )

    void(
        "SimulationIslandManager_findUnions",
        "",

        opaque_p("obj", ""),
        opaque_p("dispatcher", ""),
        opaque_p("colWorld", "")
    )

    bool(
        "SimulationIslandManager_getSplitIslands",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SimulationIslandManager_getUnionFind",
        "",

        opaque_p("obj", "")
    )

    void(
        "SimulationIslandManager_initUnionFind",
        "",

        opaque_p("obj", ""),
        int("n", "")
    )

    void(
        "SimulationIslandManager_setSplitIslands",
        "",

        opaque_p("obj", ""),
        bool("doSplitIslands", "")
    )

    void(
        "SimulationIslandManager_storeIslandActivationState",
        "",

        opaque_p("obj", ""),
        opaque_p("world", "")
    )

    void(
        "SimulationIslandManager_updateActivationState",
        "",

        opaque_p("obj", ""),
        opaque_p("colWorld", ""),
        opaque_p("dispatcher", "")
    )

    void(
        "SimulationIslandManager_delete",
        "",

        opaque_p("obj", "")
    )

}