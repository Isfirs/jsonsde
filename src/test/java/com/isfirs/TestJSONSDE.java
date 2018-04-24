package com.isfirs;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class TestJSONSDE {

    @Test
    public void testTables() {
        validate(JSONSDE.Tables());
    }

    @Test
    public void testAgentTypes() {
        validate(JSONSDE.AgentTypes());
    }

    @Test
    public void testResearchAgents() {
        validate(JSONSDE.ResearchAgents());
    }

    @Test
    public void testCerts() {
        validate(JSONSDE.Certs());
    }

    @Test
    public void testMasteries() {
        validate(JSONSDE.Masteries());
    }

    @Test
    public void testSkills() {
        validate(JSONSDE.Skills());
    }

    @Test
    public void testAncestries() {
        validate(JSONSDE.Ancestries());
    }

    @Test
    public void testAttributes() {
        validate(JSONSDE.Attributes());
    }

    @Test
    public void testBloodlines() {
        validate(JSONSDE.Bloodlines());
    }

    @Test
    public void testFactions() {
        validate(JSONSDE.Factions());
    }

    @Test
    public void testRaces() {
        validate(JSONSDE.Races());
    }

    @Test
    public void testCorpActivities() {
        validate(JSONSDE.CorpActivities());
    }

    @Test
    public void testNpcCorporationDivisions() {
        validate(JSONSDE.NpcCorporationDivisions());
    }

    @Test
    public void testNpcCorporationResearchFields() {
        validate(JSONSDE.NpcCorporationResearchFields());
    }

    @Test
    public void testNpcCorporationTrades() {
        validate(JSONSDE.NpcCorporationTrades());
    }

    @Test
    public void testNpcCorporations() {
        validate(JSONSDE.NpcCorporations());
    }

    @Test
    public void testNpcDivisions() {
        validate(JSONSDE.NpcDivisions());
    }

    @Test
    public void testAttributeCategories() {
        validate(JSONSDE.AttributeCategories());
    }

    @Test
    public void testAttributeTypes() {
        validate(JSONSDE.AttributeTypes());
    }

    @Test
    public void testEffects() {
        validate(JSONSDE.Effects());
    }

    @Test
    public void testExpressions() {
        validate(JSONSDE.Expressions());
    }

    @Test
    public void testTypeAttributes() {
        validate(JSONSDE.TypeAttributes());
    }

    @Test
    public void testTypeEffects() {
        validate(JSONSDE.TypeEffects());
    }

    @Test
    public void testGraphics() {
        validate(JSONSDE.Graphics());
    }

    @Test
    public void testIcons() {
        validate(JSONSDE.Icons());
    }

    @Test
    public void testUnits() {
        validate(JSONSDE.Units());
    }

    @Test
    public void testActivity() {
        validate(JSONSDE.Activity());
    }

    @Test
    public void testActivityMaterials() {
        validate(JSONSDE.ActivityMaterials());
    }

    @Test
    public void testActivityProbability() {
        validate(JSONSDE.ActivityProbability());
    }

    @Test
    public void testActivityProduct() {
        validate(JSONSDE.ActivityProduct());
    }

    @Test
    public void testActivityRaces() {
        validate(JSONSDE.ActivityRaces());
    }

    @Test
    public void testActivitySkills() {
        validate(JSONSDE.ActivitySkills());
    }

    @Test
    public void testBlueprints() {
        validate(JSONSDE.Blueprints());
    }

    @Test
    public void testCategories() {
        validate(JSONSDE.Categories());
    }

    @Test
    public void testContrabandTypes() {
        validate(JSONSDE.ContrabandTypes());
    }

    @Test
    public void testControlTowerResourcePurpose() {
        validate(JSONSDE.ControlTowerResourcePurpose());
    }

    @Test
    public void testControlTowerResources() {
        validate(JSONSDE.ControlTowerResources());
    }

    @Test
    public void testFlags() {
        validate(JSONSDE.Flags());
    }

    @Test
    public void testGroups() {
        validate(JSONSDE.Groups());
    }

    @Test
    public void testItems() {
        validate(JSONSDE.Items());
    }

    @Test
    public void testMarketGroups() {
        validate(JSONSDE.MarketGroups());
    }

    @Test
    public void testMetaGroups() {
        validate(JSONSDE.MetaGroups());
    }

    @Test
    public void testMetaTypes() {
        validate(JSONSDE.MetaTypes());
    }

    @Test
    public void testNames() {
        validate(JSONSDE.Names());
    }

    @Test
    public void testPositions() {
        validate(JSONSDE.Positions());
    }

    @Test
    public void testTraits() {
        validate(JSONSDE.Traits());
    }

    @Test
    public void testTypeMaterials() {
        validate(JSONSDE.TypeMaterials());
    }

    @Test
    public void testTypeReactions() {
        validate(JSONSDE.TypeReactions());
    }

    @Test
    public void testTypes() {
        validate(JSONSDE.Types());
    }

    @Test
    public void testUniqueNames() {
        validate(JSONSDE.UniqueNames());
    }

    @Test
    public void testVolumes() {
        validate(JSONSDE.Volumes());
    }

    @Test
    public void testConstellationJumps() {
        validate(JSONSDE.ConstellationJumps());
    }

    @Test
    public void testConstellations() {
        validate(JSONSDE.Constellations());
    }

    @Test
    public void testJumps() {
        validate(JSONSDE.Jumps());
    }

    @Test
    public void testLandmarks() {
        validate(JSONSDE.Landmarks());
    }

    @Test
    public void testLocationScenes() {
        validate(JSONSDE.LocationScenes());
    }

    @Test
    public void testLocationWormholeClasses() {
        validate(JSONSDE.LocationWormholeClasses());
    }

    @Test
    public void testRegionJumps() {
        validate(JSONSDE.RegionJumps());
    }

    @Test
    public void testRegions() {
        validate(JSONSDE.Regions());
    }

    @Test
    public void testSolarSystemJumps() {
        validate(JSONSDE.SolarSystemJumps());
    }

    @Test
    public void testSolarSystems() {
        validate(JSONSDE.SolarSystems());
    }

    @Test
    public void testUniverse() {
        validate(JSONSDE.Universe());
    }

    @Test
    public void testSchematics() {
        validate(JSONSDE.Schematics());
    }

    @Test
    public void testSchematicsPinMap() {
        validate(JSONSDE.SchematicsPinMap());
    }

    @Test
    public void testSchematicsTypeMAp() {
        validate(JSONSDE.SchematicsTypeMAp());
    }

    @Test
    public void testActivities() {
        validate(JSONSDE.Activities());
    }

    @Test
    public void testAssemblyLineStations() {
        validate(JSONSDE.AssemblyLineStations());
    }

    @Test
    public void testAssemblyLineTypeDetailPerCategory() {
        validate(JSONSDE.AssemblyLineTypeDetailPerCategory());
    }

    @Test
    public void testAssemblyLineTypeDetailPerGroup() {
        validate(JSONSDE.AssemblyLineTypeDetailPerGroup());
    }

    @Test
    public void testAssemblyLineTypes() {
        validate(JSONSDE.AssemblyLineTypes());
    }

    @Test
    public void testInstallationTypeContents() {
        validate(JSONSDE.InstallationTypeContents());
    }

    @Test
    public void testLicense() {
        validate(JSONSDE.License());
    }

    @Test
    public void testMaterials() {
        validate(JSONSDE.Materials());
    }

    @Test
    public void testShip() {
        validate(JSONSDE.Ship());
    }

    @Test
    public void testSkins() {
        validate(JSONSDE.Skins());
    }

    @Test
    public void testOperationServices() {
        validate(JSONSDE.OperationServices());
    }

    @Test
    public void testOperations() {
        validate(JSONSDE.Operations());
    }

    @Test
    public void testServices() {
        validate(JSONSDE.Services());
    }

    @Test
    public void testStationTypes() {
        validate(JSONSDE.StationTypes());
    }

    @Test
    public void testStations() {
        validate(JSONSDE.Stations());
    }

    @Test
    public void testTranslationTables() {
        validate(JSONSDE.TranslationTables());
    }

    @Test
    public void testTranslationColumns() {
        validate(JSONSDE.TranslationColumns());
    }

    @Test
    public void testTranslationLanguages() {
        validate(JSONSDE.TranslationLanguages());
    }

    @Test
    public void testCombatZoneSystems() {
        validate(JSONSDE.CombatZoneSystems());
    }

    @Test
    public void testCombatZones() {
        validate(JSONSDE.CombatZones());
    }

    private void validate(Object[] objects) {
        assertNotNull("Array way null", objects);

        assertFalse("Array length was 0", objects.length == 0);
    }

}
