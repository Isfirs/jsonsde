package com.isfirs;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.isfirs.json.*;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class JSONSDE {

    /**
     * JSONSDE Host
     */
    private static final String JSONSDE_HOST = "http://sde.zzeve.com";

    /**
     * All tables endpoint.
     */
    private static final String TABLES = "/tables.json";

    /**
     * Agents
     */
    private static final String agt_AGENT_TYPES = "/agtAgentTypes.json";

    /**
     * Research Agents
     */
    private static final String agt_RESEARCH_AGENTS = "/agtResearchAgents.json";

    /**
     * Certitifactes
     */
    private static final String cert_CERTS = "/certCerts.json";

    /**
     * Masteries
     */
    private static final String cert_MASTERIES = "/certMasteries.json";

    /**
     * Skills
     */
    private static final String cert_SKILLS = "/certSkills.json";

    /**
     * Ancestries
     */
    private static final String chr_ANCESTRIES = "/chrAncestries.json";

    /**
     * Attributes
     */
    private static final String chr_ATTRIBUTES = "/chrAttributes.json";

    /**
     * Bloodlines
     */
    private static final String chr_BLOODLINES = "/chrBloodlines.json";

    /**
     * Factions
     */
    private static final String chr_FACTIONS = "/chrFactions.json";

    /**
     * Races
     */
    private static final String chr_RACES = "/chrRaces.json";

    /**
     * Corp Activities
     */
    private static final String crp_ACTIVITIES = "/crpActivities.json";

    /**
     * Npc Corporation Division
     */
    private static final String crp_NPC_CORPORATION_DIVISIONS = "/crpNPCCorporationDivisions.json";

    /**
     * Npc Corporation Research Fields
     */
    private static final String crp_NPC_CORPORATION_RESEARCH_FIELDS = "/crpNPCCorporationResearchFields.json";

    /**
     * Npc Corporation Trades
     */
    private static final String crp_NPC_CORPORATION_TRADES = "/crpNPCCorporationTrades.json";

    /**
     * Npc Corporations
     */
    private static final String crp_NPC_CORPORATIONS = "/crpNPCCorporations.json";

    /**
     * Npc Divisions
     */
    private static final String crp_NPC_DIVISIONS = "/crpNPCDivisions.json";
    private static final String dgm_ATTRIBUTE_CATEGORIES = "/dgmAttributeCategories.json";
    private static final String dgm_ATTRIBUTE_TYPES = "/dgmAttributeTypes.json";
    private static final String dgm_EFFECTS = "/dgmEffects.json";
    private static final String dgm_EXPRESSIONS = "/dgmExpressions.json";
    private static final String dgm_TYPE_ATTRIBUTES = "/dgmTypeAttributes.json";
    private static final String dgm_TYPE_EFFECTS = "/dgmTypeEffects.json";
    private static final String eve_GRAPHICS = "/eveGraphics.json";
    private static final String eve_ICONS = "/eveIcons.json";
    private static final String eve_UNITS = "/eveUnitsjson";
    private static final String industry_ACTIVITY = "/industryActivity.json";
    private static final String industry_ACTIVITY_MATERIALS = "/industryActivityMaterials.json";
    private static final String industry_ACTIVITY_PROBABILITIES = "/industryActivityProbabilities.json";
    private static final String industry_ACTIVITY_PRODUCT = "/industryActivityProducts.json";
    private static final String industry_ACTIVITY_RACES = "/industryActivityRaces.json";
    private static final String industry_ACTIVITY_SKILLS = "/industryActivitySkills.json";
    private static final String industry_BLUEPRINTS = "/industryBlueprints.json";
    private static final String inv_CATEGORIES = "/invCategories.json";
    private static final String inv_CONTRABAND_TYPES = "/invContrabandTypes.json";
    private static final String inv_CONTROL_TOWER_RESOURCE_PURPOSE = "/invControlTowerResourcePurposes.json";
    private static final String inv_CONTROL_TOWER_RESOURCES = "/invControlTowerResources.json";
    private static final String inv_FLAGS = "/invFlags.json";
    private static final String inv_GROUPS = "/invGroups.json";
    private static final String inv_ITEMS = "/invItems.json";
    private static final String inv_MARKET_GROUPS = "/invMarketGroups.json";
    private static final String inv_META_GROUPS = "/invMetaGroups.json";
    private static final String inv_META_TYPES = "/invMetaTypes.json";
    private static final String inv_NAMES = "/invNames.json";
    private static final String inv_POSITIONS = "/invPositions.json";
    private static final String inv_TRAITS = "/invTraits.json";
    private static final String inv_TYPE_MATERIALS = "/invTypeMaterials.json";
    private static final String inv_TYPE_REACTIONS = "/invTypeReactions.json";
    private static final String inv_TYPES = "/invTypes.json";
    private static final String inv_UNIQUE_NAMES = "/invUniqueNames.json";
    private static final String inv_VOLUMES = "/invVolumes.json";
    private static final String map_CONSTELLATION_JUMPS = "/mapConstellationJumps.json";
    private static final String map_CONSTELLATIONS = "/mapConstellations.json";
    private static final String map_JUMPS = "/mapJumps.json";
    private static final String map_LANDMARKS = "/mapLandmarks.json";
    private static final String map_LOCATION_SCENES = "/mapLocationScenes.json";
    private static final String map_LOCATION_WORMHOLE_CLASSES = "/mapLocationWormholeClasses.json";
    private static final String map_REGION_JUMPS = "/mapRegionJumps.json";
    private static final String map_REGIONS = "/mapRegions.json";
    private static final String map_SOLARSYSTEM_JUMPS = "/mapSolarSystemJumps.json";
    private static final String map_SOLARSYSTEMS = "/mapSolarSystems.json";
    private static final String map_UNIVERSE = "/mapUniverse.json";
    private static final String planet_SCHEMATICS = "/planetSchematics.json";
    private static final String planet_SCHEMATICS_PINMAP = "/planetSchematicsPinMap.json";
    private static final String planet_SCHEMATICS_TYPEMAP = "/planetSchematicsTypeMap.json";
    private static final String ram_ACTIVITIES = "/ramActivities.json";
    private static final String ram_ASSEMBLYLINE_STATIONS = "/ramAssemblyLineStations.json";
    private static final String ram_ASSEMBLYLINE_TYPE_DETAIL_PER_CATEGORY = "/ramAssemblyLineTypeDetailPerCategory.json";
    private static final String ram_ASSEMBLYLINE_TYPE_DETAIL_PER_GROUP = "/ramAssemblyLineTypeDetailPerGroup.json";
    private static final String ram_ASSEMBLYLINE_TYPES = "/ramAssemblyLineTypes.json";
    private static final String ram_INSTALLATION_TYPE_CONTENTS = "/ramInstallationTypeContents.json";
    private static final String skin_LICENSE = "/skinLicense.json";
    private static final String skin_MATERIALS = "/skinMaterials.json";
    private static final String skin_SHIP = "/skinShip.json";
    private static final String SKINS = "/skins.json";
    private static final String sta_OPERATION_SERVICES = "/staOperationServices.json";
    private static final String sta_OPERATIONS = "/staOperations.json";
    private static final String sta_SERVICES = "/staServices.json";
    private static final String sta_STATION_TYPES = "/staStationTypes.json";
    private static final String sta_STATIONS = "/staStations.json";
    private static final String translation_TABLES = "/translationTables.json";
    private static final String trn_TRANSLATION_COLUMNS = "/trnTranslationColumns.json";
    private static final String trn_TRANSLATION_LANGUAGES = "/trnTranslationLanguages.json";
    private static final String war_COMBAT_ZONE_SYSTEMS = "/warCombatZoneSystems.json";
    private static final String war_COMBAT_ZONES = "/warCombatZones.json";

    private static final CloseableHttpClient CLIENT;

    static {
        CLIENT = HttpClientBuilder.create().build();
    }

    public static Table[] Tables() {
        return execute(TABLES, Table[].class);
    }

    // SDE

    public static AgentType[] AgentTypes() {
        return execute(agt_AGENT_TYPES, AgentType[].class);
    }

    public static ResearchAgent[] ResearchAgents() {
        return execute(agt_RESEARCH_AGENTS, ResearchAgent[].class);
    }

    public static Cert[] Certs() {
        return execute(cert_CERTS, Cert[].class);
    }

    public static Mastery[] Masteries() {
        return execute(cert_MASTERIES, Mastery[].class);
    }

    public static Skill[] Skills() {
        return execute(cert_SKILLS, Skill[].class);
    }

    public static Ancestry[] Ancestries() {
        return execute(chr_ANCESTRIES, Ancestry[].class);
    }

    public static Cert[] Attributes() {
        return execute(chr_ATTRIBUTES, Cert[].class);
    }

    public static Bloodline[] Bloodlines() {
        return execute(chr_BLOODLINES, Bloodline[].class);
    }

    public static Cert[] Factions() {
        return execute(chr_FACTIONS, Cert[].class);
    }

    public static Cert[] Races() {
        return execute(chr_RACES, Cert[].class);
    }

    public static Cert[] CorpActivities() {
        return execute(crp_ACTIVITIES, Cert[].class);
    }

    public static Cert[] NpcCorporationDivisions() {
        return execute(crp_NPC_CORPORATION_DIVISIONS, Cert[].class);
    }

    public static Cert[] NpcCorporationResearchFields() {
        return execute(crp_NPC_CORPORATION_RESEARCH_FIELDS, Cert[].class);
    }

    public static Cert[] NpcCorporationTrades() {
        return execute(crp_NPC_CORPORATION_TRADES, Cert[].class);
    }

    public static Cert[] NpcCorporations() {
        return execute(crp_NPC_CORPORATIONS, Cert[].class);
    }

    public static Cert[] NpcDivisions() {
        return execute(crp_NPC_DIVISIONS, Cert[].class);
    }

    public static Cert[] AttributeCategories() {
        return execute(dgm_ATTRIBUTE_CATEGORIES, Cert[].class);
    }

    public static Cert[] AttributeTypes() {
        return execute(dgm_ATTRIBUTE_TYPES, Cert[].class);
    }

    public static Cert[] Effects() {
        return execute(dgm_EFFECTS, Cert[].class);
    }

    public static Cert[] Expressions() {
        return execute(dgm_EXPRESSIONS, Cert[].class);
    }

    public static Cert[] TypeAttributes() {
        return execute(dgm_TYPE_ATTRIBUTES, Cert[].class);
    }

    public static Cert[] TypeEffects() {
        return execute(dgm_TYPE_EFFECTS, Cert[].class);
    }

    public static Cert[] Graphics() {
        return execute(eve_GRAPHICS, Cert[].class);
    }

    public static Cert[] Icons() {
        return execute(eve_ICONS, Cert[].class);
    }

    public static Cert[] Units() {
        return execute(eve_UNITS, Cert[].class);
    }

    public static Cert[] Activity() {
        return execute(industry_ACTIVITY, Cert[].class);
    }

    public static Cert[] ActivityMaterials() {
        return execute(industry_ACTIVITY_MATERIALS, Cert[].class);
    }

    public static Cert[] ActivityProbability() {
        return execute(industry_ACTIVITY_PROBABILITIES, Cert[].class);
    }

    public static Cert[] ActivityProduct() {
        return execute(industry_ACTIVITY_PRODUCT, Cert[].class);
    }

    public static Cert[] ActivityRaces() {
        return execute(industry_ACTIVITY_RACES, Cert[].class);
    }

    public static Cert[] ActivitySkills() {
        return execute(industry_ACTIVITY_SKILLS, Cert[].class);
    }

    public static Cert[] Blueprints() {
        return execute(industry_BLUEPRINTS, Cert[].class);
    }

    public static Cert[] Categories() {
        return execute(inv_CATEGORIES, Cert[].class);
    }

    public static Cert[] ContrabandTypes() {
        return execute(inv_CONTRABAND_TYPES, Cert[].class);
    }

    public static Cert[] ControlTowerResourcePurpose() {
        return execute(inv_CONTROL_TOWER_RESOURCE_PURPOSE, Cert[].class);
    }

    public static Cert[] ControlTowerResources() {
        return execute(inv_CONTROL_TOWER_RESOURCES, Cert[].class);
    }

    public static Cert[] Flags() {
        return execute(inv_FLAGS, Cert[].class);
    }

    public static Cert[] Groups() {
        return execute(inv_GROUPS, Cert[].class);
    }

    public static Cert[] Items() {
        return execute(inv_ITEMS, Cert[].class);
    }

    public static Cert[] MarketGroups() {
        return execute(inv_MARKET_GROUPS, Cert[].class);
    }

    public static Cert[] MetaGroups() {
        return execute(inv_META_GROUPS, Cert[].class);
    }

    public static Cert[] MetaTypes() {
        return execute(inv_META_TYPES, Cert[].class);
    }

    public static Cert[] Names() {
        return execute(inv_NAMES, Cert[].class);
    }

    public static Cert[] Positions() {
        return execute(inv_POSITIONS, Cert[].class);
    }

    public static Cert[] Traits() {
        return execute(inv_TRAITS, Cert[].class);
    }

    public static Cert[] TypeMaterials() {
        return execute(inv_TYPE_MATERIALS, Cert[].class);
    }

    public static Cert[] TypeReactions() {
        return execute(inv_TYPE_REACTIONS, Cert[].class);
    }

    public static Cert[] Types() {
        return execute(inv_TYPES, Cert[].class);
    }

    public static Cert[] UniqueNames() {
        return execute(inv_UNIQUE_NAMES, Cert[].class);
    }

    public static Cert[] Volumes() {
        return execute(inv_VOLUMES, Cert[].class);
    }

    public static Cert[] ConstellationJumps() {
        return execute(map_CONSTELLATION_JUMPS, Cert[].class);
    }

    public static Cert[] Constellations() {
        return execute(map_CONSTELLATIONS, Cert[].class);
    }

    public static Cert[] Jumps() {
        return execute(map_JUMPS, Cert[].class);
    }

    public static Cert[] Landmarks() {
        return execute(map_LANDMARKS, Cert[].class);
    }

    public static Cert[] LocationScenes() {
        return execute(map_LOCATION_SCENES, Cert[].class);
    }

    public static Cert[] LocationWormholeClasses() {
        return execute(map_LOCATION_WORMHOLE_CLASSES, Cert[].class);
    }

    public static Cert[] RegionJumps() {
        return execute(map_REGION_JUMPS, Cert[].class);
    }

    public static Cert[] Regions() {
        return execute(map_REGIONS, Cert[].class);
    }

    public static Cert[] SolarSystemJumps() {
        return execute(map_SOLARSYSTEM_JUMPS, Cert[].class);
    }

    public static Cert[] SolarSystems() {
        return execute(map_SOLARSYSTEMS, Cert[].class);
    }

    public static Cert[] Universe() {
        return execute(map_UNIVERSE, Cert[].class);
    }

    public static Schematic[] Schematics() {
        return execute(planet_SCHEMATICS, Schematic[].class);
    }

    public static Cert[] SchematicsPinMap() {
        return execute(planet_SCHEMATICS_PINMAP, Cert[].class);
    }

    public static Cert[] SchematicsTypeMAp() {
        return execute(planet_SCHEMATICS_TYPEMAP, Cert[].class);
    }

    public static Cert[] Activities() {
        return execute(ram_ACTIVITIES, Cert[].class);
    }

    public static Cert[] AssemblyLineStations() {
        return execute(ram_ASSEMBLYLINE_STATIONS, Cert[].class);
    }

    public static Cert[] AssemblyLineTypeDetailPerCategory() {
        return execute(ram_ASSEMBLYLINE_TYPE_DETAIL_PER_CATEGORY, Cert[].class);
    }

    public static Cert[] AssemblyLineTypeDetailPerGroup() {
        return execute(ram_ASSEMBLYLINE_TYPE_DETAIL_PER_GROUP, Cert[].class);
    }

    public static Cert[] AssemblyLineTypes() {
        return execute(ram_ASSEMBLYLINE_TYPES, Cert[].class);
    }

    public static Cert[] InstallationTypeContents() {
        return execute(ram_INSTALLATION_TYPE_CONTENTS, Cert[].class);
    }

    public static Cert[] License() {
        return execute(skin_LICENSE, Cert[].class);
    }

    public static Cert[] Materials() {
        return execute(skin_MATERIALS, Cert[].class);
    }

    public static Cert[] Ship() {
        return execute(skin_SHIP, Cert[].class);
    }

    public static Cert[] Skins() {
        return execute(SKINS, Cert[].class);
    }

    public static Cert[] OperationServices() {
        return execute(sta_OPERATION_SERVICES, Cert[].class);
    }

    public static Cert[] Operations() {
        return execute(sta_OPERATIONS, Cert[].class);
    }

    public static Cert[] Services() {
        return execute(sta_SERVICES, Cert[].class);
    }

    public static Cert[] StationTypes() {
        return execute(sta_STATION_TYPES, Cert[].class);
    }

    public static Cert[] Stations() {
        return execute(sta_STATIONS, Cert[].class);
    }

    public static Cert[] TranslationTables() {
        return execute(translation_TABLES, Cert[].class);
    }

    public static Cert[] TranslationColumns() {
        return execute(trn_TRANSLATION_COLUMNS, Cert[].class);
    }

    public static Cert[] TranslationLanguages() {
        return execute(trn_TRANSLATION_LANGUAGES, Cert[].class);
    }

    public static Cert[] CombatZoneSystems() {
        return execute(war_COMBAT_ZONE_SYSTEMS, Cert[].class);
    }

    public static Cert[] CombatZones() {
        return execute(war_COMBAT_ZONES, Cert[].class);
    }

    // Utility

    private static <T> T execute(final String target, Class<T> type) {
        final HttpGet request = new HttpGet(JSONSDE_HOST + target);

        try (final CloseableHttpResponse execute = CLIENT.execute(request)) {
            if (execute.getStatusLine().getStatusCode() != 200) {
                throw new RuntimeException("Error code not 200");
            }

            final HttpEntity entity = execute.getEntity();

            final ObjectMapper mapper = new ObjectMapper();

            final T agentTypes = mapper.readValue(entity.getContent(), type);

            EntityUtils.consume(entity);

            return agentTypes;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
