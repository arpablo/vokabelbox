export class Navigation {
  links: Map<string, Map<string, string>>;

  constructor(links?: Map<string, Map<string, string>>) {
    this.links = links ? links : new Map<string, Map<string, string>>();
  }

  self() {
    return this.links["self"];
  }

  first() {
    return this.links["first"];
  }

  prev() {
    return this.links["prev"];
  }

  next() {
    return this.links["next"];
  }

  last() {
    return this.links["last"];
  }
}
