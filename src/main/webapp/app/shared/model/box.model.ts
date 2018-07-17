import { IVokabel } from "./vokabel.model";

export interface IBox {
  id?: number;
  name?: string;
  vocabs?: IVokabel[];
}

export const defaultValue: Readonly<IBox> = {};
