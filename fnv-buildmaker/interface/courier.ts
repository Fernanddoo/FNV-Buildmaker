import Special from "./special";
import Perks from "./perks";
import Traits from "./traits";
import Skills from "./skills";

export default interface Courier {
    hp: number;
    lvl: number;
    special: Special;
    perks: Perks[];
    traits: Traits[];
    skills: Skills[];
};