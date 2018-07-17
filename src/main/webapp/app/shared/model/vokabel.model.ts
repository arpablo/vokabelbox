import { IBox } from "./box.model";

export interface IVokabel {
  id?: number;
  level?: number;
  sourceText?: string;
  boxes?: IBox[];
}

export const defaultValue: Readonly<IVokabel> = {};
